package Aula_2;

public class Aula2_Exemplo1 {
	
	public static void main(String[] args) {
	
		int idade = 27;
		double peso = 54.90;
		String nome = "Ana";

		// erro pego na COMPILACAO:
		idade = 46;
		
		
		System.out.printf("Olá,meu nome é " + nome + "%nEu tenho " + idade + " anos%n" + "Atualmente, eu tenho " + peso + "kg%n");
	}
}
