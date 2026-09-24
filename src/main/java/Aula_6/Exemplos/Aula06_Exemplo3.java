package Aula_6.Exemplos;

import java.util.Arrays;

// Slide 8: acessar e alterar elementos.
// A ultima linha provoca ArrayIndexOutOfBoundsException de proposito:
// o programa compila, executa e e interrompido nesse ponto.
public class Aula06_Exemplo3 {

    public static void main(String[] args) {

        double[] notas = {7.5, 8.0, 6.5};

        System.out.println(notas[0]);                  // 7.5
        System.out.println(notas[notas.length - 1]);   // 6.5
        notas[1] = 9.0;                                // altera a posicao 1
        System.out.println(Arrays.toString(notas));    // [7.5, 9.0, 6.5]
        System.out.println(notas[3]);                  // indice 3 nao existe

        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
        //     Index 3 out of bounds for length 3
    }

}
