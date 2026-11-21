package Aula_12;

// Heranca: Comissionado e um Funcionario.
public class Comissionado extends Funcionario {

    private double vendas;
    private double taxa;

    public Comissionado(String nome, int matricula,
            double vendas, double taxa) {
        super(nome, matricula);
        this.vendas = vendas;
        this.taxa = taxa;
    }

    @Override
    public String descrever() {
        return super.descrever() + ", comissionado";
    }

    // Sobrescrita: percentual sobre as vendas.
    @Override
    public double calcularSalario() {
        return vendas * taxa;
    }
}
