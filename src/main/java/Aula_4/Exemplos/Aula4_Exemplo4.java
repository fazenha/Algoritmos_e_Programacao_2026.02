package Aula_4.Exemplos;

public class Aula4_Exemplo4 {
    
    public static void main(String[] args){
        
        // BREAK
        System.out.println("===================================="); 
        System.out.println("BREAK");
        
        for (int i = 1; i < 11; i++) {
            
            if (i == 5) {
                break; 
            }
            System.out.print(i+" "); 
        }
        // 1 2 3 4
        
        // CONTINUE
        
        System.out.printf("%n");
        System.out.println("===================================="); 
        System.out.println("CONTINUE");
        
        for (int i = 1; i < 7; i++) {
            
            if (i % 2 == 0) {
                continue; 
            }
            System.out.print(i+" "); 
        }
        // 1 3 5
        
        System.out.printf("%n");
        System.out.println("===================================="); 
    }
    
}
