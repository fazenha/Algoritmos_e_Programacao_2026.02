package Aula_2;

public class Aula2_Exemplo3 {
	
	public static void main (String[] args) {
		
		double saldo = 100.75765433;
		
		saldo = saldo + 50; // forma longa
		System.out.printf("Saldo deposito (forma longa): R$ %.2f%n", saldo);
				
		saldo += 50; // equivalente
		System.out.printf("Saldo depósito (forma equivalente): R$ %.2f%n", saldo);

		saldo -= 20; // subtrai e guarda
		System.out.printf("Saldo saque: R$ %.2f%n", saldo);
		
		saldo *= 2; // multiplica e guarda
		System.out.printf("Saldo multiplicado: R$ %.2f%n", saldo);
		
		saldo /= 4; // divide e guarda
		System.out.printf("Saldo dividido por 4: R$ %.2f%n", saldo);
		
		int saldo_int = (int)saldo; // converte para inteiro
		System.out.printf("Saldo convertido para inteiro: R$ %d%n", saldo_int);
		
		String saldo_string = String.valueOf(saldo); // converte para string
		System.out.println("Saldo em string: R$ "+ saldo_string);
		
		double saldo_prox = Math.round(saldo); // arredonda para o mais próximo
		System.out.printf("Saldo arredondado para o mais próximo: R$ %.2f%n", saldo_prox); 
		
		double saldo_baixo = Math.floor(saldo); // arredonda para baixo
		System.out.printf("Saldo arredondado para baixo: R$ %.2f%n", saldo_baixo);
		
		double saldo_cima = Math.ceil(saldo); // arredonda para cima
		System.out.printf("Saldo arredondado para cima: R$ %.2f%n", saldo_cima);
		
		boolean saldo_flag=true;
		
		if(saldo_flag==true) {
			System.out.println("Saldo verdadeiro");
		}
			
	}

}
