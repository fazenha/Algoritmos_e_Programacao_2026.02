package Aula_5.Exemplos;

// Slide 13: por que evitar variaveis globais.
// As duas versoes recebem nomes diferentes para poderem ser comparadas no mesmo arquivo.
public class Aula05_Exemplo7 {

    // Depende de um campo: so funciona nesta classe e a taxa nao aparece na chamada
    static double taxa = 0.11;

    static double liquidoComCampo(double bruto) {
        return bruto - bruto * taxa;
    }

    // Recebe tudo por parametro: peca independente, atende a qualquer taxa
    static double liquidoComParametro(double bruto, double taxa) {
        return bruto - bruto * taxa;
    }

    public static void main(String[] args) {

        System.out.println("=== Depende de um campo ===");
        System.out.println(liquidoComCampo(1000));              // 890.0

        System.out.println("=== Recebe tudo por parametro ===");
        System.out.println(liquidoComParametro(1000, 0.11));    // 890.0
        System.out.println(liquidoComParametro(2000, 0.09));    // 1820.0
    }

}
