package Aula_7.Exemplos;

import java.util.ArrayList;
import java.util.HashMap;

// Slide 14: escolha da estrutura.
// Uma situacao para cada estrutura: ArrayList, matriz, array e HashMap.
public class Aula07_Exemplo7 {

    public static void main(String[] args) {

        // Notas de uma turma: valores do mesmo tipo, em ordem, que podem crescer
        ArrayList<Double> turma = new ArrayList<>();
        turma.add(7.5);
        turma.add(8.0);
        System.out.println("ArrayList: " + turma);

        // Notas por aluno e por prova: duas dimensoes de leitura
        double[][] notas = {{7.5, 8.0, 6.5}, {9.0, 5.5, 7.0}};
        System.out.println("Matriz: aluno 2, prova 3 = " + notas[1][2]);

        // Coordenada (x, y): conjunto fixo de valores
        int[] ponto = {3, 7};
        System.out.println("Array: x = " + ponto[0] + ", y = " + ponto[1]);

        // Media buscada pelo nome: valores identificados por rotulo
        HashMap<String, Double> medias = new HashMap<>();
        medias.put("Ana", 7.33);
        System.out.println("HashMap: media da Ana = " + medias.get("Ana"));
    }

}
