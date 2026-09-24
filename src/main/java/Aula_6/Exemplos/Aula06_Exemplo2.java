package Aula_6.Exemplos;

import java.util.Arrays;
import java.util.Scanner;

// Slide 7: criando e preenchendo um array.
// Duas formas: com os valores ja conhecidos ou reservando o espaco e lendo depois.
public class Aula06_Exemplo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] pesos = {2, 3, 5};              // valores conhecidos
        System.out.println(Arrays.toString(pesos));

        double[] notas = new double[5];          // 5 posicoes, todas 0.0
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(notas));

        sc.close();
    }

}
