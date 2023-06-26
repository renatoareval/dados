/* 
 * 
 * O Insertion Sort, ou ordenação por inserção, é um algoritmo de ordenação simples e eficiente.O algoritmo percorre a parte não ordenada, um elemento de cada vez, e insere cada um deles no local apropriado da parte ordenada, deslocando os elementos maiores (se houver) para a direita.
 * Ele também possui uma complexidade de tempo de O(n^2) no pior caso.
 */


public class InsertionSort {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

         System.out.println("Desordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        // insertion sort
        int aux, j;
        for (int i = 0; i < vetor.length; i++) {

            aux = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }

         System.out.println("\n\nOrdenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
 
    }
}
