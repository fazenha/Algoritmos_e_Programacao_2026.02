package Aula_10;

import java.util.ArrayList;
import java.util.Scanner;

// Aula 10: programa completo.
// Le o nome e as duas notas de cada aluno, recusa notas fora de 0 a 10
// e exibe a media e a situacao de cada aluno cadastrado.
// Entradas sugeridas: 3, Ana 7.5 8.0, Bruno 12 6.0, Carla 3.0 5.0
public class Aula10_ProgramaCompleto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> turma = new ArrayList<>();

        System.out.print("Quantidade de alunos: ");
        int qtd = sc.nextInt();
        for (int i = 0; i < qtd; i++) {
            System.out.print("Nome e duas notas: ");
            Aluno a = new Aluno(sc.next());
            if (a.lancarNotas(sc.nextDouble(), sc.nextDouble())) {
                turma.add(a);
            } else {
                System.out.println("Notas invalidas: " + a.getNome());
            }
        }

        for (Aluno a : turma) {
            System.out.printf("%s: %.2f (%s)%n", a.getNome(),
                a.calcularMedia(), a.obterSituacao());
        }
    }
}
