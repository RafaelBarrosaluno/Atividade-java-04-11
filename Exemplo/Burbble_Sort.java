package Estrutura_Dados;

//Define a classe principal chamada BubbleSort
public class Bubble_Sort {

 // Método principal que inicia a execução do programa
 public static void main(String[] args) {
     // Declara e inicializa um array de inteiros com valores desordenados
     int[] array = {5, 2, 9, 1, 5, 6};
     
     // Chama o método bubbleSort para ordenar o array
     bubbleSort(array);
     
     // Imprime uma mensagem indicando o tipo de ordenação
     System.out.print("Bubble Sort: ");
     
     // Loop para imprimir cada elemento do array ordenado
     for (int num : array) {
         System.out.print(num + " ");
     }
 }

 // Método que implementa o algoritmo Bubble Sort para ordenar o array
 public static void bubbleSort(int[] array) {
     // Armazena o tamanho do array na variável 'n'
     int n = array.length;

     // Loop externo para cada passagem pelo array (executado n-1 vezes)
     for (int i = 0; i < n - 1; i++) {
         
         // Loop interno para comparar e trocar elementos adjacentes
         // A cada passagem do loop externo, o número de comparações diminui
         for (int j = 0; j < n - 1 - i; j++) {
             
             // Compara o elemento atual com o próximo elemento
             if (array[j] > array[j + 1]) {
                 
                 // Se o elemento atual for maior que o próximo, realiza a troca
                 int temp = array[j];           // Armazena o valor de array[j] em uma variável temporária
                 array[j] = array[j + 1];       // Coloca o valor de array[j + 1] na posição array[j]
                 array[j + 1] = temp;           // Coloca o valor armazenado em temp na posição array[j + 1]
             }
         }
     }
 }
}
