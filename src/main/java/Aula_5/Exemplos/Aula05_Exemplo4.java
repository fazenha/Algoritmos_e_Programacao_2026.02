package Aula_5.Exemplos;

// Slide 10: return nao e print.
// Em Java, dois metodos com o mesmo nome e os mesmos parametros nao podem
// coexistir (so o tipo de retorno mudaria). Por isso a versao void se chama
// exibirDobro, enquanto a versao com retorno mantem o nome dobro.
public class Aula05_Exemplo4 {

    // Metodo void: exibe, mas nao devolve nada
    static void exibirDobro(int x) {
        System.out.println(x * 2);
    }

    // Metodo com retorno: devolve o valor a quem chamou
    static int dobro(int x) {
        return x * 2;
    }

    public static void main(String[] args) {

        System.out.println("=== void (exibe) ===");
        exibirDobro(5);                     // mostra 10 na tela
        // nada foi devolvido: nao ha como continuar calculando com o resultado

        System.out.println("=== com retorno (devolve) ===");
        int r = dobro(5);                   // nada aparece na tela
        System.out.println(r + 1);          // 11
    }

}
