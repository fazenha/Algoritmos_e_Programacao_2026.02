package Aula_1;
import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // Objeto para leitura do teclado
        
        System.out.println("Digite:"); // Mensagem em tela 
        
        double n1 = sc.nextDouble(); // Atribui o valor digitado
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double media = (n1+n2+n3)/3;
        
        
        System.out.println("Media = "+media); // Exibe mensagem
    }
}
