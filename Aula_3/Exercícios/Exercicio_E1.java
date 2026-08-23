package Aula_3.Exercícios;

import java.util.Scanner;

public class Exercicio_E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        double numero = sc.nextDouble();

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        sc.close();
    }
}
