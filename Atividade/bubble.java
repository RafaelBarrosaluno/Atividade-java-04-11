package main;

// Define a classe principal chamada BubbleSort
public class bubble {

    // Método principal que inicia a execução do programa
    public static void main(String[] args) {
        // Declara e inicializa diferentes arrays de inteiros para testes
        int[] array1 = {5, 2, 9, 1, 5, 6};
        int[] array2 = {3, 2, 1, 4};
        int[] array3 = {10, 20, 30, 40, 50};

        // Chama o método bubbleSort para ordenar e contar trocas para cada array
        ordenarEImprimir(array1);
        ordenarEImprimir(array2);
        ordenarEImprimir(array3);
    }

    // Método auxiliar para ordenar o array e imprimir o resultado e número de trocas
    public static void ordenarEImprimir(int[] array) {
        System.out.print("Array antes da ordenação: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Ordena e conta as trocas
        int trocas = bubbleSort(array);

        // Imprime o array ordenado
        System.out.print("Array ordenado: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Número de trocas realizadas: " + trocas + "\n");
    }

    // Método que implementa o algoritmo Bubble Sort para ordenar o array e contar trocas
    public static int bubbleSort(int[] array) {
        int n = array.length;
        int trocaCount = 0; // Variável para contar o número de trocas

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Realiza a troca e incrementa o contador de trocas
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    trocaCount++; // Incrementa o número de trocas
                }
            }
        }
        return trocaCount; // Retorna o número total de trocas
    }
}
