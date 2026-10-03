package Aula_7.Exemplos;

import java.util.HashMap;

// Slide 13: array-par e HashMap.
// Array-par: posicoes fixas. HashMap: acesso por chave (rotulo).
public class Aula07_Exemplo6 {

    public static void main(String[] args) {

        // Array-par: o Java nao tem tupla, entao um int[] guarda o par (x, y)
        int[] ponto = {3, 7};
        System.out.println(ponto[0]);       // 3

        final int[] p = {3, 7};
        p[0] = 5;                           // permitido: o final protege a variavel, nao os valores
        System.out.println(p[0]);           // 5
        // p = new int[2];                  // nao compila: cannot assign a value to final variable p

        // HashMap: cada valor tem um rotulo proprio
        var medias = new HashMap<String, Double>();
        medias.put("Ana", 7.33);
        medias.put("Bruno", 7.17);

        System.out.println(medias.get("Ana"));              // 7.33
        System.out.println(medias.containsKey("Carla"));    // false
        System.out.println(medias.get("Carla"));            // null (chave inexistente)
    }

}
