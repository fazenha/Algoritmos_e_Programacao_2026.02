package Aula_4.Exemplos;
import java.util.Scanner;


public class Aula4_Exemplo6 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===================================="); 
        System.out.println("CÁLCULO FOLHA DE PAGAMENTO");
        
        System.out.print("Informe a quantidade: ");
        int quantidade = sc.nextInt();
        double folhaBruta = 0;
        double folhaInss = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Salario " + i + ": ");
            double bruto = sc.nextDouble();
            double aliquota;

            if (bruto <= 1500) {
                aliquota = 0.075;
            } else if (bruto <= 2800) {
                aliquota = 0.09;
            } else if (bruto <= 4200) {
                aliquota = 0.12;
            } else {
                aliquota = 0.14; }

            double inss = bruto * aliquota;
            folhaBruta += bruto;
            folhaInss += inss;
            System.out.printf("  Liquido: R$ %.2f%n", bruto-inss); 
        }
        System.out.println("------------------------------------");
        System.out.println("Total:"); 
        System.out.printf("bruto: R$ %.2f%n", folhaBruta);
        System.out.printf("INSS:  R$ %.2f%n", folhaInss);
        System.out.println("===================================="); 
        
    }
    
}
