/*O Bubble Sort, é um algoritmo de ordenação simples e intuitivo. Ele funciona comparando pares adjacentes de elementos em uma lista e trocando-os se estiverem na ordem errada. Esse processo é repetido várias vezes até que a lista esteja totalmente ordenada ele recebe esse nome  porque os elementos maiores flutuam para o topo da lista.


Embora seja um algoritmo simples de entender e implementar, ele não é eficiente e tem  uma complexidade de tempo de O(n^2), onde n é o número de elementos na lista,sendo assim  ele é mais utilizado para listas pequenas
*/

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 12, 1, 6, 3, 10};
        
        System.out.println("Array antes da ordenação:");
        printArray(arr);
        
        bubbleSort(arr);
        
        System.out.println("Array após a ordenação:");
        printArray(arr);
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Troca os elementos arr[j] e arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

