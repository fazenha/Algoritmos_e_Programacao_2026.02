package Aula_6.Exemplos;

import java.util.Arrays;

// Slides 5 e 6: anatomia de um array e o array na memoria.
// Declarar, criar e atribuir; indices de 0 a n - 1.
public class Aula06_Exemplo1 {

    public static void main(String[] args) {

        // Em tres passos
        double[] notas;                  // 1. declarar: so o nome, ainda sem posicoes
        notas = new double[5];           // 2. criar: 5 posicoes, todas com 0.0
        notas[0] = 7.5;                  // 3. atribuir: guarda um valor na posicao 0

        System.out.println(Arrays.toString(notas));     // [7.5, 0.0, 0.0, 0.0, 0.0]

        // Forma abreviada: declara, cria e atribui em uma linha
        double[] outras = {7.5, 8.0, 6.5, 9.0, 5.5, 7.0};

        System.out.println(outras[0]);                  // 7.5 (primeiro elemento)
        System.out.println(outras[outras.length - 1]);  // 7.0 (ultimo elemento)
        System.out.println(outras.length);              // 6   (maior indice valido: 5)
    }

}
