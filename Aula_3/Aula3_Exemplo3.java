package Aula_3;
import java.util.Scanner;

public class Aula3_Exemplo3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um número: ");

        int numero = sc.nextInt();
        String nome;

        switch (numero) {
             case 1:
                nome = "Segunda";
            break;
            
            case 2:
                nome = "Terca";
            break;
        
            case 3:
                nome = "Quarta";
            break;  

            case 4:
                nome = "Quinta";
            break;  

            case 5:
                nome = "Sexta";
            break;

            case 6:
                nome = "Sabado";
            break;
            
            case 7:
                nome = "Domingo";
            break; 
            
            default:
                nome = "não é dia da semana!";                
        }

        System.out.println("O número " + numero + " corresponde ao dia da semana: " + nome);
    }
}
