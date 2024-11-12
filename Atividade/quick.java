import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};

        System.out.println("Quick Sort com diferentes estratégias de pivô:");
        System.out.print("Pivô no primeiro elemento: ");
        quickSort(array.clone(), 0, array.length - 1, "primeiro");
        printArray(array);

        System.out.print("Pivô no último elemento: ");
        quickSort(array.clone(), 0, array.length - 1, "ultimo");
        printArray(array);

        System.out.print("Pivô no meio do array: ");
        quickSort(array.clone(), 0, array.length - 1, "meio");
        printArray(array);

        System.out.print("Pivô aleatório: ");
        quickSort(array.clone(), 0, array.length - 1, "aleatorio");
        printArray(array);
    }

    // Método para imprimir o array
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método que implementa o Quick Sort para ordenar o array com escolha de pivô
    public static void quickSort(int[] array, int low, int high, String pivotType) {
        if (low < high) {
            int pi = partition(array, low, high, pivotType);

            quickSort(array, low, pi - 1, pivotType);
            quickSort(array, pi + 1, high, pivotType);
        }
    }

    // Método que particiona o array com base na estratégia de escolha de pivô
    public static int partition(int[] array, int low, int high, String pivotType) {
        int pivotIndex = selectPivot(array, low, high, pivotType);
        int pivot = array[pivotIndex];

        // Troca o pivô com o último elemento para manter a estrutura do algoritmo
        swap(array, pivotIndex, high);

        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    // Método para escolher o pivô com base na estratégia
    private static int selectPivot(int[] array, int low, int high, String pivotType) {
        switch (pivotType) {
            case "primeiro":
                return low;
            case "ultimo":
                return high;
            case "meio":
                return low + (high - low) / 2;
            case "aleatorio":
                Random rand = new Random();
                return low + rand.nextInt(high - low + 1);
            default:
                throw new IllegalArgumentException("Tipo de pivô inválido");
        }
    }

    // Método para trocar elementos no array
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
