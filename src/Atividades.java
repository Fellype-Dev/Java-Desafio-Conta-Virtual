public class Atividades {
    public static void main(String[] args) {
        //Crie um programa que realize a média de duas notas decimais e exiba o resultado.

        double nota1 = 8.5;
        double nota2 = 7.5;

        double media = (nota1 + nota2) / 2;

        System.out.println("1. A média entre as duas notas é: " + media);

        //Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
        double variavel1 = 10.6;
        int variavel2 = (int) variavel1;

        System.out.println("2. O valor da variável double convertido para int é: " + variavel2);

        //Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
        char letra = 'A';
        String palavra = "Bacana";

        System.out.println("3. " + palavra + "! voce tirou nota " + letra);

        //Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

        double preco = 15.90;
        int quantidade = 8;

        double valorTotal = preco * quantidade;

        System.out.println("4. O valor total da compra é de R$ " + valorTotal);

        //Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

        double vaoresEmDolares = 90.5;

        double valorEmReais = vaoresEmDolares * 4.94;

        System.out.println("5. " + vaoresEmDolares + " dólares equivalem a R$ " + valorEmReais);

        //Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

        double precoOriginal = 150.0;
        double percentualDesconto = 10.0;

        double valorDesconto = precoOriginal * (percentualDesconto / 100);

        double novoPreco = precoOriginal - valorDesconto;

        System.out.println("6. O novo preço do produto com desconto é de R$ " + novoPreco);


    }


}

