package Aula_5.Exemplos;

// Slide 11: passagem de parametros.
// Java sempre passa por valor; em arrays e objetos, o valor copiado e o endereco.
public class Aula05_Exemplo5 {

    // Primitivo: recebe uma copia do valor
    static void dobra(int x) {
        x = x * 2;
    }

    // Array: recebe uma copia da referencia (aponta para o mesmo array)
    static void zera(int[] v) {
        v[0] = 0;
    }

    public static void main(String[] args) {

        // Primitivo: cópia do valor
        int n = 5;
        dobra(n);
        System.out.println(n);              // 5

        // Array: cópia da referência
        int[] notas = {7, 8, 9};
        zera(notas);
        System.out.println(notas[0]);       // 0
    }

}
