package Aula_6.Exemplos;

import java.util.ArrayList;

// Slide 12: busca e insercao.
// Busca linear no array; insercao no meio com ArrayList.
public class Aula06_Exemplo7 {

    public static void main(String[] args) {

        // Busca linear (array)
        double[] v = {7.5, 8.0, 6.5, 9.0, 5.5};

        int pos = -1;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == 9.0) {
                pos = i;
                break;
            }
        }
        System.out.println(pos);            // 3 (se nao encontrar, continua -1)

        // Insercao no meio (ArrayList)
        ArrayList<Double> l = new ArrayList<>();
        l.add(10.0);
        l.add(30.0);
        l.add(1, 20.0);   // insere na posicao 1
        System.out.println(l);
        // [10.0, 20.0, 30.0]
    }

}
