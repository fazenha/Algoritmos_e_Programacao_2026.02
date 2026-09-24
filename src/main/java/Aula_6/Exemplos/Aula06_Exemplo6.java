package Aula_6.Exemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Slide 11: operacoes essenciais.
// O que ja vem pronto e o que se resolve com um laco, no array e no ArrayList.
public class Aula06_Exemplo6 {

    public static void main(String[] args) {

        // ----- Array -----
        double[] v = {7.5, 8.0, 6.5, 9.0};

        System.out.println("Tamanho: " + v.length);             // 4

        double soma = 0;                                         // somar: laco com acumulador
        for (double x : v) {
            soma += x;
        }
        System.out.println("Soma: " + soma);                    // 31.0

        double maior = v[0];                                     // maior: laco com comparacao
        for (double x : v) {
            if (x > maior) {
                maior = x;
            }
        }
        System.out.println("Maior: " + maior);                  // 9.0

        Arrays.sort(v);                                          // void: altera o proprio array
        System.out.println(Arrays.toString(v));                 // [6.5, 7.5, 8.0, 9.0]

        // ----- ArrayList -----
        ArrayList<Double> l = new ArrayList<>();
        l.add(7.5);                                              // acrescenta ao final
        l.add(8.0);
        l.add(6.5);

        System.out.println("Tamanho: " + l.size());             // 3
        System.out.println("Maior: " + Collections.max(l));     // 8.0
        System.out.println(l.contains(8.0));                    // true
        System.out.println(l.indexOf(8.0));                     // 1
        System.out.println(l.indexOf(10.0));                    // -1 (nao encontrado)

        l.remove(0);                                             // remove a posicao 0
        Collections.sort(l);
        System.out.println(l);                                   // [6.5, 8.0]
    }

}
