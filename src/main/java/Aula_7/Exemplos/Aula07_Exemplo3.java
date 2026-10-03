package Aula_7.Exemplos;

import java.util.Arrays;
import java.util.Scanner;

// Slide 9: criando a matriz por leitura.
// O laco externo percorre as linhas; o interno, as colunas de cada linha.
public class Aula07_Exemplo3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] notas = new double[4][3];     // 4 linhas, 3 colunas

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Aluno " + (i + 1) + ", A" + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }
        System.out.println(Arrays.deepToString(notas));

        // Experimente: Arrays.toString(notas) exibe so os enderecos das linhas
        System.out.println(Arrays.toString(notas));

        sc.close();
    }

}
