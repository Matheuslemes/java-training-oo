package exercicios;

public class Exercicios01 {
    public static void main(String[] args) {
        // exercicio: Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit.
        // Utilize variáveis para representar os valores das temperaturas e imprima no console o valor convertido de Celsius para Fahrenheit.
        int celsius = 20;
        double fahrenheit = (int) (celsius * 1.8) + 32;
//        int fahrenheit = (double) (celsius * 9.0 / 5.0) + 32.0;
        System.out.println("Celsius para Fahrenheit: " + fahrenheit);

        // Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double nota01 = 20;
        double nota02 = 30;

        double media = (nota01 + nota02) / 2;
        System.out.println("A média é: " + media);

        // Declare uma variável do tipo double e uma variável do tipo int.
        // Faça o casting da variável double para int e imprima o resultado.
        double numDouble = 52.6;
        int numInteiro = (int) numDouble;
        System.out.println("Casting de double pra int: " + numInteiro);

        // Declare uma variável do tipo char(letra) e uma variável do tipo String(palavra).
        // Atribua valores a essas variáveis e concatene-as em uma mensagem
        char letra = 'M';
        String palavra = "atheus";
        String concatenacao = letra + palavra;
        System.out.println(concatenacao);

        // Declare uma variável do tipo double 'precoProduto' e uma variável do tipo int (quantidade).
        // Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem
        double precoProduto = 20.50;
        int quantidade = 3;
        String total = "O total é: " + precoProduto * quantidade;
        System.out.println(total);

        // Declare uma variável do tipo double 'valorEmDolar'. Atribua um valor em dólar a essa variáel.
        // Considere que o valor de 1 dólar é equivalente a 4,94 reais. Realize a conversão do  valor
        // em dólares para reais e imprima o resultado formatado.
        double valorEmDolar = 50.84;
        double real = (int) 4.94;
        System.out.println("Valor convertido: " + valorEmDolar * real);

        // Declare uma variável do tipo double 'precoOrignial'. Atribua um valor em reais a essa variável,
        // representando o preço original de um produto. Em seguida, declare uma variável do tipo double
        // 'percentualDesconto' e atribua um valor percentual de desnconto ao produto (por exemplo, 10 para 10%)
        // Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
        double precoOriginal = 15.20;
        double percentualDesconto = 10.0;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;
        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Novo preço com desconto: R$" + novoPreco);
    }
}
