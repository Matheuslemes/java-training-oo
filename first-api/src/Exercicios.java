public class Exercicios {
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

    }
}
