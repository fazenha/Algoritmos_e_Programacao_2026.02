package Aula_11;

public class Aula11_ProgramaCompleto {

    public static void main(String[] args) {
        Cliente ana = new Cliente("Ana");
        ContaBancaria conta = new ContaBancaria(ana);

        // conta.saldo = -5000.0;   // nao compila: saldo e privado

        conta.depositar(100.0);
        conta.sacar(30.0);
        System.out.println("Saldo: " + conta.getSaldo());

        try {
            conta.depositar(-50.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Titular: " + conta.getTitular().getNome());
        conta.exibirExtrato();
    }
}
