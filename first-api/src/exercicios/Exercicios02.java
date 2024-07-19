package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicios02 {
    public static void main(String[] args) {
        /*
         Crie um programa que simula um jogo de advinhação, que deve gerar um número aleatório entre 0
         e 100 e pedir para que o usuário tente adivnhar o número, em até 5 tentativas. A cada tentativa, o programa
         deve informar se o número digitado pelo usuário é maior do que o número gerado.
        */

        Scanner nLeitura = new Scanner(System.in);
        int nAleatorio = new Random().nextInt(100);
        int nTentativas = 0;
        int nDigitado = 0;

        while (nTentativas < 5) {
            System.out.println("Digite um número: ");
            nDigitado = nLeitura.nextInt();
            nTentativas++;

            if (nDigitado == nAleatorio) {
                System.out.println("Você acertou!");
                break;
            } else if (nDigitado < nAleatorio) {
                System.out.println("O número gerado é menor!");
            } else {
                System.out.println("O número gerado é maior!");
            }
        }
        if (nTentativas == 5 && nDigitado != nAleatorio) {
            System.out.println("Você não acertou em 5 tentativas! O numero gerado era:" + nAleatorio);
        }

    }

}
