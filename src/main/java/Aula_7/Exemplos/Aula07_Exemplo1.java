package Aula_7.Exemplos;

import java.util.Arrays;

// Slides 6 e 7: anatomia de uma matriz e indices de linha e coluna.
// Declarar, criar e atribuir; o primeiro indice e a linha, o segundo e a coluna.
public class Aula07_Exemplo1 {

    public static void main(String[] args) {

        // Em tres passos
        double[][] notas;                  // 1. declarar: so o nome, ainda sem posicoes
        notas = new double[4][3];          // 2. criar: 4 linhas, 3 colunas, tudo 0.0
        notas[0][0] = 7.5;                 // 3. atribuir: linha 0, coluna 0

        System.out.println(Arrays.deepToString(notas));

        // Forma abreviada: chaves dentro de chaves
        double[][] turma = {{7.5, 8.0, 6.5},
                            {9.0, 5.5, 7.0},
                            {6.0, 7.5, 8.5},
                            {8.0, 9.0, 9.5}};

        System.out.println(turma[1][2]);                  // 7.0 (linha 1, coluna 2)
        System.out.println(Arrays.toString(turma[1]));    // [9.0, 5.5, 7.0] (a linha inteira)
        System.out.println(turma.length);                 // 4 (numero de linhas)
        System.out.println(turma[0].length);              // 3 (numero de colunas)
    }

}
