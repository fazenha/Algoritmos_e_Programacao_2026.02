package Aula_6.Exemplos;

// Slide 9: percorrendo o array.
// for-each quando basta o valor; for com indice para a posicao ou a alteracao.
public class Aula06_Exemplo4 {

    public static void main(String[] args) {

        double[] notas = {7.5, 8.0, 6.5};

        // for-each (so o valor)
        for (double nota : notas) {
            System.out.println(nota);
        }
        // 7.5
        // 8.0
        // 6.5

        // for com indice (valor e posicao)
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Aluno %d: %.1f%n",
                              i + 1, notas[i]);
        }
        // Aluno 1: 7.5
        // Aluno 2: 8.0
        // Aluno 3: 6.5
    }

}
