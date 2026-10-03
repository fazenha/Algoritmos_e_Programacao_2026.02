package Aula_7.Exemplos;

import java.util.Arrays;

// Slide 18: erros a evitar com matrizes.
// Linhas nulas, contagem de colunas e o segundo laco esquecido.
public class Aula07_Exemplo9 {

    public static void main(String[] args) {

        double[][] notas = {{7.5, 8.0, 6.5}, {9.0, 5.5, 7.0},
                            {6.0, 7.5, 8.5}, {8.0, 9.0, 9.5}};

        // Contar colunas errado: notas.length e o numero de LINHAS
        System.out.println("Linhas: " + notas.length);          // 4
        System.out.println("Colunas: " + notas[0].length);      // 3

        // Esquecer o segundo laco: imprime a referencia de cada linha
        for (double[] linha : notas) {
            System.out.println(linha);                          // [D@...
        }
        // Correto: um laco para os valores da linha
        for (double[] linha : notas) {
            System.out.println(Arrays.toString(linha));
        }

        // Linha nula: new double[3][] cria 3 linhas, todas null
        double[][] m = new double[3][];
        System.out.println(m[0]);                               // null

        // Provoque o erro: acessar a linha antes de aloca-la
        System.out.println(m[0][0]);                            // NullPointerException

        // Correto: new double[3][3] cria as linhas e as colunas
    }

}
