package Aula_3.Exercícios;

import java.util.Scanner;

public class Exercicio_E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o consumo de energia (kWh):");
        double consumo = sc.nextDouble();
        double total;

        // Exemplo de faixas de consumo e tarifas por kWh
        if (consumo <= 100) {
            total = consumo * 0.50; // Tarifa básica
        } else if (consumo > 100 && consumo <= 200) {
            total = (100 * 0.50) + ((consumo - 100) * 0.75); // Tarifa intermediária
        } else {
            total = (100 * 0.50) + (100 * 0.75) + ((consumo - 200) * 0.95); // Tarifa alta
        }

        System.out.printf("O valor total da conta é: R$ %.2f\n", total);
        sc.close();
    }
}
