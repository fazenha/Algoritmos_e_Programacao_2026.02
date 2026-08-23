package Aula_3;
import java.util.Scanner;

public class Aula3_Exemplo4 {

    public static void main(String[] args) {
        
        // Solicita a idade e renda do usuário
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite sua renda: ");
        double renda = sc.nextDouble();

        sc.nextLine(); // Limpa o buffer do scanner

        System.out.println("Tem restrição? (Sim/Não)");
        String restricao = sc.nextLine();

        System.out.println("Tem avalista? (Sim/Não)");
        String avalista = sc.nextLine();
    
        // faixa etaria: entre 18 e 65 
        if (idade >= 18 && idade <= 65) {            

            // tem renda maior que 3000 e não tem restrição ou tem avalista
            if ((renda >= 3000 && restricao.equals("Não")) || avalista.equals("Sim")) {
                System.out.println("Credito aprovado"); 
            } else {
                System.out.println("Requisitos não atendidos"); 
            }            
        } else{
            System.out.println("Idade não permitida");
        }        
    }    
}
