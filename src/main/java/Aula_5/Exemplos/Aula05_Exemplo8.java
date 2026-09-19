package Aula_5.Exemplos;

import java.util.Scanner;

// Slides 14 a 16: folha de pagamento decomposta em funcoes.
// Mesmo problema do Exemplo 1, agora modularizado.
public class Aula05_Exemplo8 {

    // Regra: escolher a aliquota pela faixa salarial
    static double calcularAliquota(double bruto) {
        if (bruto <= 1500) {
            return 0.075;
        } else if (bruto <= 2800) {
            return 0.09;
        } else if (bruto <= 4200) {
            return 0.12;
        }
        return 0.14;
    }

    // Calculo: obter o INSS (composicao: uma funcao chamando outra)
    static double calcularInss(double bruto) {
        return bruto * calcularAliquota(bruto);
    }

    // Entrada e saida: ler, repetir e exibir
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de funcionarios: ");
        int n = sc.nextInt();
        double totalInss = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Salario bruto do funcionario " + i + ": ");
            double bruto = sc.nextDouble();
            double inss = calcularInss(bruto);
            System.out.printf("  Liquido: R$ %.2f%n", bruto - inss);
            totalInss += inss;
        }

        System.out.printf("Total: R$ %.2f%n", totalInss);

        sc.close();
    }

}
