package main;

public class MergeSortWithTrace {

    public static void main(String[] args) {
        // Declara e inicializa um array de inteiros desordenado
        int[] array = {5, 2, 9, 1, 5, 6};

        // Chama o método mergeSort para ordenar o array
        System.out.println("Estado inicial do array:");
        printArray(array);
        mergeSort(array, 0, array.length - 1);

        // Imprime uma mensagem indicando o tipo de ordenação
        System.out.print("Array ordenado com Merge Sort: ");
        printArray(array);
    }

    // Método que implementa o algoritmo Merge Sort para ordenar o array
    public static void mergeSort(int[] array, int left, int right) {
        // Verifica se o array pode ser dividido
        if (left < right) {
            // Calcula o ponto médio do array
            int mid = (left + right) / 2;

            // Imprime o estado do array antes da divisão
            System.out.println("Dividindo: " + "left=" + left + ", mid=" + mid + ", right=" + right);
            printArray(array, left, right);

            // Recursivamente aplica o mergeSort na metade esquerda
            mergeSort(array, left, mid);

            // Recursivamente aplica o mergeSort na metade direita
            mergeSort(array, mid + 1, right);

            // Combina as duas metades ordenadas
            merge(array, left, mid, right);

            // Imprime o estado do array após a combinação
            System.out.println("Combinando: " + "left=" + left + ", mid=" + mid + ", right=" + right);
            printArray(array, left, right);
        }
    }

    // Método que combina dois subarrays ordenados em um único array ordenado
    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Cria arrays temporários para armazenar as metades
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copia dados para os arrays temporários L e R
        for (int i = 0; i < n1; i++)
            L[i] = array[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = array[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Combina os subarrays em ordem crescente
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        // Copia qualquer elemento restante do subarray esquerdo
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        // Copia qualquer elemento restante do subarray direito
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    // Método para imprimir o estado atual do array completo
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método para imprimir uma parte específica do array
    public static void printArray(int[] array, int left, int right) {
        for (int i = left; i <= right; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
