package Aula_6.Exemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Slides 15 e 16: analise de notas (programa integrado).
// Contar as notas acima da media so e possivel porque todas foram guardadas.
public class Aula06_Exemplo10 {

    // Le qtd notas e devolve uma lista nova (o Scanner chega por parametro)
    static ArrayList<Double> lerNotas(Scanner sc, int qtd) {
        ArrayList<Double> notas = new ArrayList<>();
        for (int i = 0; i < qtd; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas.add(sc.nextDouble());
        }
        return notas;
    }

    // Conta quantas notas ficaram acima do limite
    static int contarAcima(ArrayList<Double> notas, double limite) {
        int total = 0;
        for (double nota : notas) {
            if (nota > limite) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notas = lerNotas(sc, 5);

        double soma = 0;
        for (double x : notas) {
            soma += x;
        }
        double media = soma / notas.size();

        System.out.printf("Media: %.2f%n", media);
        System.out.printf("Maior: %.2f%n", Collections.max(notas));
        System.out.printf("Acima da media: %d%n", contarAcima(notas, media));

        sc.close();
    }

}
