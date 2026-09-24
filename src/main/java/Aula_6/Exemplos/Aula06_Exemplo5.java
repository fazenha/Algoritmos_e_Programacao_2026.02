package Aula_6.Exemplos;

import java.util.ArrayList;

// Slide 10: array e ArrayList.
// Array: tamanho fixo. ArrayList: cresce a cada add.
public class Aula06_Exemplo5 {

    public static void main(String[] args) {

        // Array: tamanho fixo
        double[] v = new double[3];
        v[0] = 7.5;
        v[1] = 8.0;
        double x = v[0];
        int n = v.length;       // 3
        System.out.println("Array: primeiro = " + x + ", tamanho = " + n);

        // ArrayList: tamanho variavel
        ArrayList<Double> l = new ArrayList<>();
        l.add(7.5);
        l.add(8.0);
        double y = l.get(0);
        int m = l.size();       // 2
        System.out.println("ArrayList: primeiro = " + y + ", tamanho = " + m);
    }

}
