// Importa a ferramenta Scanner para que o programa consiga ler o teclado
package Aula_1;

import java.util.Scanner;

// Define a classe pública "Exemplo2".
public class Aula1_Exemplo2 {
  public static void main(String[] args) { // Este é o método principal (main)  
    
    Scanner sc = new Scanner(System.in);  // Cria um objeto chamado 'sc' para a leitura 
    
    // ----------------------------------------------------
    // 1. ETAPA DE ENTRADA (Captura de dados)
    // ----------------------------------------------------
    
    System.out.print("Seu nome: ");  // Exibe uma mensagem na tela 
    String nome = sc.nextLine();   // Lê a linha de texto 
    
    System.out.print("Sua idade: "); // Exibe uma mensagem pedindo a idade  
    int idade = sc.nextInt(); // Lê o número inteiro
    
    // ----------------------------------------------------
    // 2. ETAPA DE PROCESSAMENTO (Cálculos e lógica)
    // ----------------------------------------------------
  
    int anoNasc = 2026 - idade; // Faz a conta
    
    // ----------------------------------------------------
    // 3. ETAPA DE SAÍDA (Exibição dos resultados)
    // ----------------------------------------------------
    
    System.out.println("Ola, " + nome); // Exibe a saudação       
    System.out.println("Nasceu em " + anoNasc); // Exibe o resultado
    
  } // Fim do método main
} // Fim da classe Exemplo1
