package Estrutura_Dados;

//Define a classe principal chamada SelectionSort
public class Selection_Sort {

 // Método principal que inicia a execução do programa
 public static void main(String[] args) {
     // Declara e inicializa um array de inteiros com valores desordenados
     int[] array = {5, 2, 9, 1, 5, 6};

     // Chama o método selectionSort para ordenar o array
     selectionSort(array);

     // Imprime uma mensagem indicando o tipo de ordenação
     System.out.print("Selection Sort: ");
     
     // Loop para imprimir cada elemento do array ordenado
     for (int num : array) {
         System.out.print(num + " ");
     }
 }

 // Método que implementa o algoritmo Selection Sort para ordenar o array
 public static void selectionSort(int[] array) {
     // Armazena o tamanho do array na variável 'n'
     int n = array.length;

     // Loop externo para cada posição do array até o penúltimo elemento
     // Em cada iteração, 'i' indica a posição atual onde o menor valor será colocado
     for (int i = 0; i < n - 1; i++) {

         // Define 'minIndex' como a posição inicial 'i'
         // Supondo que o menor elemento do subarray não ordenado está em 'i'
         int minIndex = i;

         // Loop interno para encontrar o menor elemento no subarray de i+1 até o final
         for (int j = i + 1; j < n; j++) {

             // Se o elemento em 'j' é menor que o elemento em 'minIndex',
             // atualiza 'minIndex' para 'j'
             if (array[j] < array[minIndex]) {
                 minIndex = j; // Atualiza 'minIndex' com o índice do menor valor encontrado
             }
         }

         // Após encontrar o menor elemento no subarray, troca-o com o elemento na posição 'i'
         // Armazena o valor de array[minIndex] em uma variável temporária 'temp'
         int temp = array[minIndex];

         // Coloca o valor de array[i] na posição array[minIndex]
         array[minIndex] = array[i];

         // Coloca o valor armazenado em 'temp' na posição array[i]
         array[i] = temp;
     }
 }
}
