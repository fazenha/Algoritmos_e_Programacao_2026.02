package Aula_4.Exemplos;

public class Aula4_Exemplo2 {
    
    public static void main(String[] args){
        
        System.out.println("===================================="); 
        System.out.println("Laço 1"); 
        for (int i = 0; i < 5; i++) {
            System.out.print(i+" "); 
        }
        System.out.printf("%n"); 
        // 0 1 2 3 4

        System.out.println("===================================="); 
        System.out.println("Laço 2"); 
        for (int i = 1; i < 6; i++) {
            System.out.print(i+" "); 
        }
        System.out.printf("%n"); 
        // 1 2 3 4 5

        System.out.println("===================================="); 
        System.out.println("Laço 3"); 
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i+" "); 
        }
        System.out.printf("%n"); 
        // 0 2 4 6 8
        
        System.out.println("===================================="); 
        System.out.println("Laço 4"); 
        for (int i = 10; i > 0; i--) {
            System.out.print(i+" "); 
        }
        System.out.printf("%n"); 
        // 10 9 8 ... 1        
        
        System.out.println("===================================="); 
    }    
    
}
