package Estrutura_Dados;

public class Insertion_Sort {

    public static void main(String[] args) {
        // Declara e inicializa um array de inteiros com valores desordenados
        int[] array = {5, 2, 9, 1, 5, 6};

        // Chama o método insertionSort para ordenar o array
        insertionSort(array);

        // Imprime uma mensagem indicando o tipo de ordenação
        System.out.print("Insertion Sort: ");

        // Loop para imprimir cada elemento do array ordenado
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // Método que implementa o algoritmo Insertion Sort para ordenar o array
    public static void insertionSort(int[] array) {
        // Armazena o tamanho do array na variável 'n'
        int n = array.length;

        // Loop externo que percorre o array a partir do segundo elemento
        for (int i = 1; i < n; i++) {
            // Armazena o valor do elemento atual em 'key'
            int key = array[i];

            // Define o índice do elemento anterior a 'i'
            int j = i - 1;

            // Move elementos maiores que 'key' uma posição para a direita
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];  // Desloca o elemento para a direita
                j = j - 1;                // Decrementa 'j' para verificar o próximo elemento à esquerda
            }

            // Insere 'key' na posição correta dentro do subarray ordenado
            array[j + 1] = key;
        }
    }
}
