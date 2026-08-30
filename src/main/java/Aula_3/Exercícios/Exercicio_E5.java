package Aula_3.Exercícios;

import java.util.Scanner;

public class Exercicio_E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade:");
        int idade = sc.nextInt();

        System.out.println("Digite o tempo de contribuição (em anos):");
        int tempoContribuicao = sc.nextInt();

        // Regra dupla: precisa cumprir ambos os critérios mínimos
        if (idade >= 65 && tempoContribuicao >= 20) {
            System.out.println("Parabéns! Você já pode se aposentar.");
        } else {
            System.out.println("Você ainda não atendeu aos requisitos mínimos para aposentadoria.");
            System.out.println("Faltam " + Math.max(0, 65 - idade) + " anos de idade.");
            System.out.println("Faltam " + Math.max(0, 20 - tempoContribuicao) + " anos de contribuição.");
        }

        sc.close();
    }
}

