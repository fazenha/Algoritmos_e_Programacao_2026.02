package Aula_5.Exemplos;

// Slide 9: sobrecarga e delegacao.
// Um valor padrao simulado: a versao curta delega a versao completa.
public class Aula05_Exemplo3 {

    static void saudacao(String nome, String tratamento) {
        System.out.println("Bom dia, " + tratamento + " " + nome + "!");
    }

    static void saudacao(String nome) {
        saudacao(nome, "Prof.");                // delegacao
    }

    public static void main(String[] args) {

        saudacao("Ana");                        // Bom dia, Prof. Ana!
        saudacao("Bruno", "Dr.");               // Bom dia, Dr. Bruno!
    }

}
