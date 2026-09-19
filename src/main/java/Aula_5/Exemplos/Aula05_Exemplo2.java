package Aula_5.Exemplos;

// Slide 7: definir, chamar e reutilizar.
// A mesma funcao, chamada duas vezes com argumentos diferentes.
public class Aula05_Exemplo2 {

    static double calcularMedia(double n1, double n2, double n3) {
        double soma = n1 + n2 + n3;
        double media = soma / 3;
        return media;
    }

    public static void main(String[] args) {

        double turmaA = calcularMedia(8, 7, 9);
        double turmaB = calcularMedia(5, 6.5, 4);

        System.out.println(turmaA);              // 8.0
        System.out.printf("%.2f%n", turmaB);     // 5.17
    }

}
