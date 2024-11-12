package main;

public class InsertionSortTest {

    public static void main(String[] args) {
        // Declara e inicializa três arrays para teste
        int[] sortedArray = {1, 2, 3, 4, 5, 6};             // Array já ordenado
        int[] reverseArray = {6, 5, 4, 3, 2, 1};            // Array em ordem reversa
        int[] partiallySortedArray = {1, 3, 2, 5, 4, 6};    // Array parcialmente ordenado

        // Testa o Insertion Sort em cada array e imprime o número de comparações
        System.out.println("Array já ordenado:");
        testInsertionSort(sortedArray);

        System.out.println("\nArray em ordem reversa:");
        testInsertionSort(reverseArray);

        System.out.println("\nArray parcialmente ordenado:");
        testInsertionSort(partiallySortedArray);
    }

    public static void testInsertionSort(int[] array) {
        int[] arrayCopy = array.clone();  // Cria uma cópia do array para não modificar o original
        int comparisons = insertionSort(arrayCopy);

        // Imprime o array ordenado
        System.out.print("Array ordenado: ");
        for (int num : arrayCopy) {
            System.out.print(num + " ");
        }

        // Imprime o número de comparações realizadas
        System.out.println("\nComparações realizadas: " + comparisons);
    }

    // Método que implementa o Insertion Sort e conta o número de comparações
    public static int insertionSort(int[] array) {
        int n = array.length;
        int comparisons = 0;  // Contador de comparações

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Conta as comparações e move os elementos
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
                comparisons++;  // Incrementa o contador de comparações
            }
            comparisons++;  // Conta a última comparação (quando a condição falha)
            array[j + 1] = key;
        }
        return comparisons;
    }
}
