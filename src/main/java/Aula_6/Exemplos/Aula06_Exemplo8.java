package Aula_6.Exemplos;

import java.util.Arrays;

// Slide 13: copiando trechos do array.
// O indice inicial entra; o final fica de fora (como a condicao < do for).
public class Aula06_Exemplo8 {

    public static void main(String[] args) {

        double[] v = {7.5, 8.0, 6.5, 9.0, 5.5};

        System.out.println(Arrays.toString(Arrays.copyOfRange(v, 1, 3)));          // [8.0, 6.5]
        System.out.println(Arrays.toString(Arrays.copyOfRange(v, 0, 2)));          // [7.5, 8.0]
        System.out.println(Arrays.toString(Arrays.copyOfRange(v, 2, v.length)));   // [6.5, 9.0, 5.5]

        // Copia independente: alterar a copia nao altera o original
        double[] copia = v.clone();
        copia[0] = 0.0;
        System.out.println(Arrays.toString(copia));   // [0.0, 8.0, 6.5, 9.0, 5.5]
        System.out.println(Arrays.toString(v));       // [7.5, 8.0, 6.5, 9.0, 5.5]
    }

}
