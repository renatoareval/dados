/*
 * 
 * 
 * O Selection Sort (ou "ordenação por seleção") é um algoritmo de ordenação simples e intuitivo. Ele funciona encontrando repetidamente o elemento mínimo (ou máximo) da lista não classificada e movendo-o para a posição correta na lista classificada. O processo continua até que toda a lista esteja classificada.
 */

public class SelectionSort {

    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        System.out.println("Desordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        // selection sort
        int pos_menor, aux;
        for (int i = 0; i < vetor.length; i++) {
            pos_menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[pos_menor]) {
                    pos_menor = j;
                }
            }
            aux = vetor[pos_menor];
            vetor[pos_menor] = vetor[i];
            vetor[i] = aux;
        }

        System.out.println("\n\nOrdenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
    
}