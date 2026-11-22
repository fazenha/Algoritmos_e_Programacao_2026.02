package Aula_11;

// Cliente: existe independentemente da conta (associacao).
public class Cliente {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
