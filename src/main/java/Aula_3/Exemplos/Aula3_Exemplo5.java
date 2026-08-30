package Aula_3;
import java.util.Scanner;

public class Aula3_Exemplo5 {

    
    public static void main(String[] args) {

        System.out.println("Digite o salário bruto: ");
        Scanner sc = new Scanner(System.in);
        double bruto = sc.nextDouble();

        double aliquota;

        if (bruto <= 1500) {
            aliquota = 0.075;
        } else if (bruto <= 2800) {
            aliquota = 0.09;
        } else if (bruto <= 4200) {
            aliquota = 0.12;
        } else {
            aliquota = 0.14; 
        }

        double inss = bruto * aliquota;
        double liquido = bruto - inss;

        System.out.printf("INSS (%.1f%%): R$ %.2f%n", aliquota*100, inss);
        System.out.printf("Liquido: R$ %.2f%n", liquido);

    }        
    
}