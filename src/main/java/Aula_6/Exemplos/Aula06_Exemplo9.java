package Aula_6.Exemplos;

import java.util.ArrayList;

// Slide 14: listas em metodos sao compartilhadas.
// O parametro recebe a referencia: as duas variaveis apontam para a mesma lista.
public class Aula06_Exemplo9 {

    // O metodo altera a original
    static void bonus(ArrayList<Double> l) {
        l.add(10.0);
    }

    // O metodo copia antes de alterar
    static ArrayList<Double> comBonus(
            ArrayList<Double> l) {
        ArrayList<Double> nova =
            new ArrayList<>(l);
        nova.add(10.0);
        return nova;
    }

    public static void main(String[] args) {

        ArrayList<Double> notas = new ArrayList<>();
        notas.add(7.5);
        bonus(notas);
        System.out.println(notas);      // [7.5, 10.0]  mudou

        ArrayList<Double> outras = new ArrayList<>();
        outras.add(7.5);
        ArrayList<Double> b = comBonus(outras);
        System.out.println(outras);     // [7.5]        continua igual
        System.out.println(b);          // [7.5, 10.0]
    }

}
