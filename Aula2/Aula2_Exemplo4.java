package Aula2;
import java.util.Scanner;

public class Aula2_Exemplo4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. Entrada
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Valor da hora: ");
		
		double valor = sc.nextDouble();
		System.out.print("Horas no mes: ");
		double horas = sc.nextDouble();
		
		// 2. Processamento
		double bruto = valor * horas;
		double inss = bruto * 0.11;
		double liquido = bruto - inss;
		
		// 3. Saida
		System.out.printf("Bruto:   R$ %.2f%n", bruto);
		System.out.printf("INSS:    R$ %.2f%n", inss);
		System.out.printf("Liquido: R$ %.2f%n", liquido);
		
	}

}
