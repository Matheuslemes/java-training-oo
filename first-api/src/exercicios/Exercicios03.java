package exercicios;

import java.util.Scanner;

public class Exercicios03 {
    public static void main(String[] args) {
        /*
        OBS: para testar os códigos de cada exercicio, retire o codigo do exercicio que deseja do comentario
        um de cada vez! 
        
        * 1- Crie um programa que solicite ao usuário digitar um número. Se o número for
        * positivo, exiba "Número positivo", caso contrário, exiba "Número negativo"
        * 
        * 2- Peça ao usuário para inserir dois números inteiros.Compare os números e imprima uma
        * mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

        3- Crie um menu que oferece duas opções ao usuário: "1: Calcular área do quadrado" e "2: Calcular área
        do círculo", Solicite a escolhado usuário e realize o cálculo da área com base na opção selecionada

        4- Cite um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10

        5- Crie um programa que solicite ao usuário a entrada de um número inteiro.
        Verifique se o número é par ou ímpar e exiba uma mensagem correspondente

        6- Crie um programa que solicite ao usuário um número e calcule o fatorial desse número
        * */

        // ex: 01
//        Scanner nLeitura = new Scanner(System.in);
//
//        System.out.println("Digite");
//        int nDigitado = nLeitura.nextInt();
//
//        if (nDigitado > 0) {
//            System.out.println("O número que você digitou é: " + nDigitado + ", portanto é positivo!");
//        } else {
//            System.out.println("O número que você digitou é: " + nDigitado + ", portanto é negativo!");
//        }
        
        // ex: 02
//        Scanner nLeitura = new Scanner(System.in);
//
//        System.out.println("Digite o primeiro número: ");
//        int nDigitado01 = nLeitura.nextInt();
//        System.out.println("Digite o segundo número: ");
//        int nDigitado02 = nLeitura.nextInt();
//
//        if (nDigitado01 == nDigitado02) {
//            System.out.println("Os números são iguais!");
//        } else if (nDigitado01 > nDigitado02) {
//            System.out.println("O primeiro número é maior!");
//        } else {
//            System.out.println("O segundo número é maior");
//        }

        // ex: 03
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println(
//                        """
//                        ---Menu---
//                        1 - Calcular a área do quadrado
//                        2 - Calcular a área do circulo
//                        """);
//        int opcao = scanner.nextInt();
//        if (opcao == 1) {
//            System.out.println("Digite a base: ");
//            double base = scanner.nextDouble();
//            System.out.println("Digite a altura: ");
//            double altura = scanner.nextDouble();
//            double areaQuadrado = base * altura;
//            System.out.println("A área do quadrado é: " + areaQuadrado);
//        } else if (opcao == 2) {
//            System.out.println("Digite o raio: ");
//            double raio = scanner.nextDouble();
//            double areaCirculo = 3.14 * (raio * raio);
//            System.out.println("A area do circulo é: " + areaCirculo);
//        }
        // a melhor forma de fazer um menu para usuarios é usando while, com a possibilidade de repetir operaçoes
        // sem o código ser finalizado


        // ex: 04
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite um número: ");
//        int numero = scanner.nextInt();
//
//        System.out.println("Tabuada do " + numero + ":");
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(numero + " x " + i + " = " + (numero * i));
//        }

        // ex: 05
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite um número inteiro: ");
//        int numero = scanner.nextInt();
//
//        if (numero % 2 == 0) {
//            System.out.println("O número é par!");
//        } else {
//            System.out.println("O númerpo é ímpar!");
//        }

        // ex: 06
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}