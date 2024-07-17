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

        int nLeitura = new Scanner(System.in).nextInt();
        int nAleatorio = new Random().nextInt(100);
        int nTentativas = 0;
        int nDigitado = 0;

        while (nTentativas < 5) {

        }

    }

}
