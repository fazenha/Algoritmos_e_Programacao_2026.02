package Aula_3;

import java.util.Scanner;

public class Aula3_Exemplo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a média do aluno: ");

        double media = sc.nextDouble();
        String conceito;

        if (media >= 9) {
            conceito = "A";
        } 

        else if (media >= 7) {
            conceito = "B";
        } 

        else if (media >= 5) {
            conceito = "C";
        } 
        
        else {
            conceito = "D";
        }
        System.out.println("Conceito: " + conceito);
       
    }
    
}
