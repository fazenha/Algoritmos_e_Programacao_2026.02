package Aula_3;
import java.util.Scanner;

public class Aula3_Exemplo1 {
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");

        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade");
            System.out.println("Pode dirigir");

        }
        else {
            System.out.println("Menor de idade");
            System.out.println("Não pode dirigir");
        }
        System.out.println("Fim do programa");
    }
}
