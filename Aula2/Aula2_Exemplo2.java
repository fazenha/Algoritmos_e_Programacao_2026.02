package Aula2;
import java.util.Scanner;

public class Aula2_Exemplo2 {
		
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* ============================================
		 * Entrada
		 * ============================================ */
		
		System.out.println("Olá, digite o primeiro número:");
		double numero_1 = sc.nextDouble();
		
		System.out.println("Olá, digite o segundo número:");
		double numero_2 = sc.nextDouble();
		
		/* ============================================
		 * Processamento
		 * ============================================ */
		
		double soma = numero_1 + numero_2; // soma
		double subtracao = numero_1 - numero_2; // subtração
		double multiplicacao = numero_1 * numero_2; // multiplicação
		double divisao = numero_1 / numero_2; // divisão
		double resto = numero_1 % numero_2; // resto
		double potencia = Math.pow(numero_1, numero_2); // potenciação
		
		
		/* ============================================
		 * Saída
		 * ============================================ */
		
		System.out.printf("A soma de " + numero_1 + " + " + numero_2 + " é = " + soma + "%n");
		System.out.printf("A subtração de " + numero_1 + " - " + numero_2 + " é = " + subtracao + "%n");
		System.out.printf("A multiplicação de " + numero_1 + " * " + numero_2 + " é = " + multiplicacao + "%n");
		System.out.printf("A divisão de " + numero_1 + " / " + numero_2 + " é = " + divisao + "%n");
		System.out.printf("A potencia de " + numero_1 + " ^ " + numero_2 + " é = " + potencia + "%n");		
		
	}

}
