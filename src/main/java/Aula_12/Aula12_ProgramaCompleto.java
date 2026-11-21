package Aula_12;

import java.util.ArrayList;

// Aula 12: demonstracao final (heranca, sobrescrita, toString,
// polimorfismo, classe abstrata e interface).
public class Aula12_ProgramaCompleto {

    public static void main(String[] args) {
        ArrayList<Funcionario> equipe = new ArrayList<>();
        equipe.add(new Assalariado("Ana", 101, 4000.00));
        equipe.add(new Comissionado("Bruno", 102, 50000.00, 0.06));
        equipe.add(new Horista("Carla", 103, 25.00, 160));

        // Polimorfismo: println chama toString, que chama descrever,
        // e cada objeto executa a versao de descrever da propria classe.
        for (Funcionario f : equipe) {
            System.out.println(f);
        }

        // Classe abstrata: cada subclasse calcula o salario a sua maneira.
        double folha = 0;
        for (Funcionario f : equipe) {
            double salario = f.calcularSalario();
            folha += salario;
            System.out.printf("%s: R$ %.2f%n", f.getNome(), salario);
        }
        System.out.printf("Total da folha: R$ %.2f%n", folha);

        // Interface: funcionarios e faturas na mesma lista.
        ArrayList<Pagavel> contas = new ArrayList<>();
        contas.add(new Assalariado("Ana", 101, 4000.00));
        contas.add(new Fatura("Energia", 850.00));
        contas.add(new Fatura("Internet", 300.00));

        double total = 0;
        for (Pagavel c : contas) {
            total += c.calcularPagamento();
        }
        System.out.printf("Total a pagar: R$ %.2f%n", total);
    }
}
