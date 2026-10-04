package Aula_7.Exemplos;

import java.util.Arrays;

// Slide 8: acessar e alterar elementos.
// Os dois indices entre colchetes leem ou substituem o valor daquela posicao.
public class Aula07_Exemplo2 {

    public static void main(String[] args) {

        double[][] notas = {{7.5, 8.0, 6.5}, {9.0, 5.5, 7.0},
                            {6.0, 7.5, 8.5}, {8.0, 9.0, 9.5}};

        System.out.println(notas[1][2]);                  // 7.0
        System.out.println(notas[1].length);              // 3
        notas[0][0] = 10.0;                               // altera a posicao
        System.out.println(Arrays.toString(notas[0]));    // [10.0, 8.0, 6.5]

        // Provoque o erro: a linha 4 nao existe (indices validos: 0 a 3)
        //System.out.println(notas[4][0]);                  // ArrayIndexOutOfBoundsException
    }

}
