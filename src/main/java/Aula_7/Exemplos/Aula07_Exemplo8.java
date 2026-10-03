package Aula_7.Exemplos;

// Slides 15 e 16: funcoes do boletim e programa integrado.
// A media do aluno percorre uma linha; a media da prova, uma coluna.
public class Aula07_Exemplo8 {

    // Media de uma linha: recebe a matriz e o indice do aluno
    static double mediaDoAluno(double[][] notas, int i) {
        double soma = 0;
        for (double nota : notas[i]) {
            soma += nota;
        }
        return soma / notas[i].length;
    }

    // Media de uma coluna: recebe a matriz e o indice da prova
    static double mediaDaProva(double[][] notas, int j) {
        double soma = 0;
        for (double[] linha : notas) {
            soma += linha[j];
        }
        return soma / notas.length;
    }

    public static void main(String[] args) {
        String[] alunos = {"Ana", "Bruno", "Carla", "Diego"};
        double[][] notas = {{7.5, 8.0, 6.5}, {9.0, 5.5, 7.0},
                            {6.0, 7.5, 8.5}, {8.0, 9.0, 9.5}};

        for (int i = 0; i < alunos.length; i++) {
            double m = mediaDoAluno(notas, i);
            System.out.printf("%-6s media %.2f%n", alunos[i], m);
        }
        for (int j = 0; j < notas[0].length; j++) {
            double m = mediaDaProva(notas, j);
            System.out.printf("Prova %d: %.2f%n", j + 1, m);
        }
    }

}
