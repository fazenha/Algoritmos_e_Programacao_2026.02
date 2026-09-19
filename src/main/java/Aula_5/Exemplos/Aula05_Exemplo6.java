package Aula_5.Exemplos;

// Slide 12: escopo da variavel local.
// A variavel desconto so existe durante a execucao de calcular.
public class Aula05_Exemplo6 {

    static double calcular(double bruto) {
        double desconto = bruto * 0.11;
        return bruto - desconto;
    }

    public static void main(String[] args) {

        System.out.println(calcular(1000));     // 890.0

        // Descomente a linha abaixo para ver o erro de compilacao:
        // System.out.println(desconto);        // erro: fora do escopo
        // error: cannot find symbol
        //   symbol:   variable desconto
    }

}
