import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite:");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double media = (n1+n2+n3)/3;
        
        System.out.println("Media = "+media);
    }
}
