package Aula_11;

import java.util.ArrayList;

public class ContaBancaria {

    private Cliente titular;                 // associacao: recebido pronto
    private double saldo;                    // privado: so muda por metodos
    private ArrayList<Movimentacao> extrato; // composicao: criado aqui

    public ContaBancaria(Cliente titular) {
        this.titular = titular;
        this.extrato = new ArrayList<>();
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor invalido: " + valor);
        }
        saldo += valor;
        extrato.add(new Movimentacao("Deposito", valor));
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            extrato.add(new Movimentacao("Saque", valor));
            return true;
        }
        return false;
    }

    public void exibirExtrato() {
        for (Movimentacao m : extrato) {
            m.exibir();                      // delegacao
        }
    }
}
