package Aula_12;

// Heranca: Horista e um Funcionario.
public class Horista extends Funcionario {

    private double valorHora;
    private int horas;

    public Horista(String nome, int matricula,
            double valorHora, int horas) {
        super(nome, matricula);
        this.valorHora = valorHora;
        this.horas = horas;
    }

    @Override
    public String descrever() {
        return super.descrever() + ", horista";
    }

    // Sobrescrita: valor da hora vezes horas trabalhadas.
    @Override
    public double calcularSalario() {
        return valorHora * horas;
    }
}
