package Aula_12;

// Superclasse da hierarquia: reune o que e comum a todo funcionario.
// Classe abstrata: nao existe funcionario generico, logo ela nao pode ser
// instanciada. Implementa a interface Pagavel, entao toda subclasse tambem e Pagavel.
public abstract class Funcionario implements Pagavel {

    protected String nome;
    protected int matricula;

    public Funcionario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String descrever() {
        return nome + " (matrícula " + matricula + ")";
    }

    // Metodo abstrato: apenas a assinatura. Cada subclasse define a regra.
    public abstract double calcularSalario();

    // Interface: o pagamento de um funcionario e o proprio salario.
    @Override
    public double calcularPagamento() {
        return calcularSalario();
    }

    // toString: sobrescreve a versao herdada de Object.
    @Override
    public String toString() {
        return descrever();
    }
}
