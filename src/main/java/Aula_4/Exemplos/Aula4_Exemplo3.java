package Aula_4.Exemplos;
import java.util.Scanner;

public class Aula4_Exemplo3 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        // SENTINELA
        
        System.out.println("===================================="); 
        System.out.println("SENTINELA");
        double soma = 0;
        int total = 0;
        
        System.out.print("Digite uma matricula:");
        double salario = sc.nextDouble();
        while (salario != 0) {
            soma = soma + salario;
            total = total + 1;
            System.out.print("Digite uma matricula:");
            salario = sc.nextDouble();
        }
        
        System.out.println(total + " funcionarios");
        System.out.println("===================================="); 
        
        // VALIDAÇÃO DA ENTRADA
        System.out.println("VALIDAÇÃO DA ENTRADA");
        
        System.out.print("Digite uma nota:");
        double nota = sc.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota invalida.");
            System.out.print("Digite uma nota valida:");
            nota = sc.nextDouble();
        }
        
        System.out.println("Nota aceita: " + nota);
        System.out.println("===================================="); 

    }
    
}
