import java.util.Scanner;

public class ContaVirtual {
    public static void main(String[] args) {
        String nome = "Fellype";
        String tipoConta = "Corrente";
        double saldo = 1000.0;
        int opcao = 0;

        Scanner leitura = new Scanner(System.in);

        String menu = """
                    *** Digite a opção desejada ***
                    
                    1 - Consultar dados da conta
                    2 - Transferir Valor
                    3 - Receber Valor
                    4 - Sair
                    """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("""
                            ****************************************************************
                            Dados da conta
                            
                            Nome: """ + nome + """
                            \nTipo da conta: """ + tipoConta + """
                            \nSaldo: R$ """ + saldo + """
                            \n****************************************************************
                            """);
                    break;

                case 2:
                    System.out.println("Qual o valor que deseja transferir?");
                    double valorTransferido = leitura.nextDouble();
                    if (valorTransferido > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= valorTransferido;
                        System.out.println("Transferência realizada com sucesso");
                    }
                    break;

                case 3:
                    System.out.println("Qual o valor a receber?");
                    double valorRecebido = leitura.nextDouble();
                    saldo += valorRecebido;
                    System.out.println("Valor recebido com sucesso");
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
