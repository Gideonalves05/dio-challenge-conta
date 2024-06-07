package com.javaconta;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o número da conta
        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();

        // Solicita e lê a agência
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        // Solicita e lê o nome do cliente
        System.out.println("Por favor, digite o seu nome!");
        scanner.nextLine();  // Consumir a nova linha deixada por nextInt() ou next()
        String nomeCliente = scanner.nextLine();

        // Solicita e lê o saldo
        System.out.println("Por favor, digite o saldo!");
        double saldo = scanner.nextDouble();

        // Exibe a mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                          ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);

        scanner.close();
    }
}
