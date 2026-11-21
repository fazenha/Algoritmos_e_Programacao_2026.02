package Aula_12;

// Heranca: Assalariado e um Funcionario.
public class Assalariado extends Funcionario {

    private double salarioFixo;

    public Assalariado(String nome, int matricula, double salarioFixo) {
        super(nome, matricula); // a superclasse inicializa nome e matricula
        this.salarioFixo = salarioFixo;
    }

    // Sobrescrita: reaproveita a versao da superclasse e acrescenta o tipo.
    @Override
    public String descrever() {
        return super.descrever() + ", assalariado";
    }

    // Sobrescrita: salario fixo.
    @Override
    public double calcularSalario() {
        return salarioFixo;
    }
}
