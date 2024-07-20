package exercicios;

import java.util.Scanner;

public class Exercicos04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int operacao = 0;

        String nome = "Matheus Silva Lemes";
        double saldo = 3000;
        String conta = "Poupança";

        String dados = "=====Dados iniciais=====" +
                "\nNome Cliente: " + nome +
                "\nTipo Conta: " + conta +
                "\nSaldo Inicial: " + saldo +
                "\n============================";

        String menu = """
                    =====MENU PRINCIPAL=====
                    1 - Consultar Saldo
                    2 - Depositar
                    3 - Transgferir
                    4 - Sair 
                    """;

        while (operacao != 4) {
            System.out.println(menu);

            operacao = scanner.nextInt();


            if (operacao == 1) {
                System.out.println("Seu saldo atual é: " + saldo);

            } else if (operacao == 2) {
                System.out.println("Qual valor deseja depositar: ");
                double valorDepositado =  scanner.nextDouble();
                saldo += valorDepositado;
                System.out.println("Valor depositado: " + valorDepositado);
                System.out.println("Saldo atual: " + saldo);

            } else if (operacao == 3) {
                System.out.println("Qual valor deseja transferir: ");
                double valorTransferir = scanner.nextDouble();
                if (valorTransferir > saldo) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo = saldo - valorTransferir ;
                    System.out.println("Valor trasferido: " + valorTransferir);
                    System.out.println("Saldo atual: " + saldo);
                }
            } else {
                System.out.println("Fim da operação, obrigado!");
            }

        }
    }
}
