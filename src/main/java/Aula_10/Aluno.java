package Aula_10;

// Aula 10: classe Aluno do programa completo.
// Reune atributos, construtores sobrecarregados, this, getters e setters,
// um metodo modificador (lancarNotas) e metodos de consulta.
public class Aluno {

    // Atributos (estado)
    String nome;
    double n1;
    double n2;

    // Construtores sobrecarregados
    Aluno(String nome) {
        this.nome = nome;
    }

    Aluno(String nome, double n1, double n2) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
    }

    // Getters: devolvem o valor de um atributo
    String getNome() {
        return nome;
    }

    double getN1() {
        return n1;
    }

    double getN2() {
        return n2;
    }

    // Setters: alteram um atributo somente se o valor for valido
    void setN1(double n1) {
        if (n1 >= 0 && n1 <= 10) {
            this.n1 = n1;
        }
    }

    void setN2(double n2) {
        if (n2 >= 0 && n2 <= 10) {
            this.n2 = n2;
        }
    }

    // Metodo modificador: altera as duas notas ou nenhuma
    boolean lancarNotas(double n1, double n2) {
        if (n1 < 0 || n1 > 10 || n2 < 0 || n2 > 10) {
            return false;
        }
        this.n1 = n1;
        this.n2 = n2;
        return true;
    }

    // Metodos de consulta
    double calcularMedia() {
        return (n1 + n2) / 2;
    }

    boolean estaAprovado() {
        return calcularMedia() >= 5;
    }

    String obterSituacao() {
        if (estaAprovado()) {
            return "aprovado";
        }
        return "reprovado";
    }
}
