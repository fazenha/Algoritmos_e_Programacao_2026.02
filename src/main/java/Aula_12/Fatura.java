package Aula_12;

// Uma fatura tambem e paga, mas nao e um funcionario:
// nao ha heranca, apenas a mesma interface.
public class Fatura implements Pagavel {

    private String descricao;
    private double valor;

    public Fatura(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public double calcularPagamento() {
        return valor;
    }
}
