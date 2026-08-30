package Aula_4.Exemplos;

public class Aula4_Exemplo5 {
    
    public static void main(String[] args){        
        
        // define qual tabuada
        for (int tabuada = 1; tabuada <= 10; tabuada++) {
            
            System.out.printf("--- Tabuada do %d ---%n", tabuada);

            // calcula a tabuada do número indicado no laço
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d%n", tabuada, i, tabuada*i);
            }
        }
        
    }
    
}
