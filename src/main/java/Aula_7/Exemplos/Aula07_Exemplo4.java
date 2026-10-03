package Aula_7.Exemplos;

// Slide 10: percorrendo a matriz.
// for com indices (posicao e alteracao) e for-each aninhado (so o valor).
public class Aula07_Exemplo4 {

    public static void main(String[] args) {

        double[][] notas = {{7.5, 8.0, 6.5}, {9.0, 5.5, 7.0},
                            {6.0, 7.5, 8.5}, {8.0, 9.0, 9.5}};

        // for com indices: o laco externo da 4 voltas; o interno, 3 em cada
        System.out.println("for com indices:");
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }

        // for-each aninhado: cada elemento externo e um double[]
        System.out.println("for-each aninhado:");
        for (double[] linha : notas) {
            for (double nota : linha) {
                System.out.print(nota + " ");
            }
            System.out.println();
        }

        // Apenas o for com indices altera a matriz
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = notas[i][j] + 0.5;     // bonus de 0.5 em todas as notas
            }
        }
        System.out.println("Depois do bonus, notas[0][0] = " + notas[0][0]);   // 8.0
    }

}
