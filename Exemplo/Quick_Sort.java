package Estrutura_Dados;

public class Quick_Sort {

    public static void main(String[] args) {
        // Declara e inicializa um array de inteiros desordenado
        int[] array = {5, 2, 9, 1, 5, 6};

        // Chama o método quickSort para ordenar o array
        quickSort(array, 0, array.length - 1);

        // Imprime uma mensagem indicando o tipo de ordenação
        System.out.print("Quick Sort: ");

        // Loop para imprimir cada elemento do array ordenado
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // Método que implementa o algoritmo Quick Sort para ordenar o array
    public static void quickSort(int[] array, int low, int high) {
        // Verifica se o array pode ser dividido
        if (low < high) {
            // Particiona o array e obtém o índice do pivô
            int pi = partition(array, low, high);

            // Recursivamente aplica o quickSort na metade esquerda do pivô
            quickSort(array, low, pi - 1);

            // Recursivamente aplica o quickSort na metade direita do pivô
            quickSort(array, pi + 1, high);
        }
    }

    // Método que particiona o array em torno do pivô
    public static int partition(int[] array, int low, int high) {
        // Escolhe o último elemento como pivô
        int pivot = array[high];

        // Índice do menor elemento
        int i = low - 1;

        // Loop para mover elementos menores que o pivô para a esquerda
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;

                // Troca array[i] com array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Coloca o pivô na posição correta
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Retorna o índice do pivô
        return i + 1;
    }
}
