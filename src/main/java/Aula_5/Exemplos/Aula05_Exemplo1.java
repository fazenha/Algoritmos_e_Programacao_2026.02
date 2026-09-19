package Aula_5.Exemplos;

import java.util.Scanner;

// Slide 4: o problema do programa monolitico.
// Entrada, regra, calculo e saida misturados dentro do main.
public class Aula05_Exemplo1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de funcionarios: ");
        int n = sc.nextInt();
        double totalInss = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Salario bruto do funcionario " + i + ": ");
            double bruto = sc.nextDouble();
            double aliquota;

            if (bruto <= 1500) {
                aliquota = 0.075;
            } else if (bruto <= 2800) {
                aliquota = 0.09;
            } else if (bruto <= 4200) {
                aliquota = 0.12;
            } else {
                aliquota = 0.14;
            }

            double inss = bruto * aliquota;
            System.out.printf("Liquido: %.2f%n", bruto - inss);
            totalInss += inss;
        }

        System.out.printf("Total: %.2f%n", totalInss);

        sc.close();
    }

}
