package Aula_3.Exercícios;

import java.util.Scanner;

public class Exercicio_E6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- MENU DE OPERAÇÕES ---");
        System.out.println("1 - Adição (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");
        System.out.print("Escolha a opção (1-4): ");
        int opcao = sc.nextInt();

        System.out.println("Digite o primeiro número:");
        double n1 = sc.nextDouble();

        System.out.println("Digite o segundo número:");
        double n2 = sc.nextDouble();

        switch (opcao) {
            case 1:
                System.out.println("Resultado da Adição: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Resultado da Subtração: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Resultado da Multiplicação: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Resultado da Divisão: " + (n1 / n2));
                } else {
                    System.out.println("Erro: Não é possível dividir por zero!");
                }
                break;
            default:
                System.out.println("Opção inválida no menu.");
                break;
        }

        sc.close();
    }
}
