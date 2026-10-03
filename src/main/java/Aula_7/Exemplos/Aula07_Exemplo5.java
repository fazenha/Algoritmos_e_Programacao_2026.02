package Aula_7.Exemplos;

// Slide 11: somas por linha e por coluna (e a soma geral).
// Trocar a ordem dos lacos troca a linha pela coluna.
public class Aula07_Exemplo5 {

    public static void main(String[] args) {

        double[][] notas = {{7.5, 8.0, 6.5}, {9.0, 5.5, 7.0},
                            {6.0, 7.5, 8.5}, {8.0, 9.0, 9.5}};

        // Por linha: media de cada aluno
        double total = 0;
        for (int i = 0; i < notas.length; i++) {
            double soma = 0;                        // zerada a cada linha
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }
            total += soma;
            System.out.printf("Aluno %d: %.2f%n", i + 1, soma / notas[i].length);
        }

        // Por coluna: media de cada prova (o externo agora percorre as colunas)
        for (int j = 0; j < notas[0].length; j++) {
            double soma = 0;                        // zerada a cada coluna
            for (int i = 0; i < notas.length; i++) {
                soma += notas[i][j];
            }
            System.out.printf("Prova %d: %.2f%n", j + 1, soma / notas.length);
        }

        // A soma geral e a soma das somas por linha (ou por coluna)
        System.out.printf("Soma geral: %.1f%n", total);
    }

}
