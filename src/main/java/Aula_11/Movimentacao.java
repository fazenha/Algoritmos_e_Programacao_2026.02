package Aula_11;

// Movimentacao do extrato: criada pela conta e so existe dentro dela (composicao).
public class Movimentacao {

    private String tipo;
    private double valor;

    public Movimentacao(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public void exibir() {
        System.out.println(tipo + ": " + valor);
    }
}
