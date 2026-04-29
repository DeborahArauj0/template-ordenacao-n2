public class InsertionSort implements SortingStrategy {

    /**
    * O array  está ordenado exceto pelo último elemento. Esse método
    * deve colocar o último elemento em sua posição.
    * Importante: seu algoritmo deve ser O(n).
    */
    public void insereUltimoOrdenado(int[] v) {
        // TODO: implementar
        int inserido = v[v.length -1]; //ultimo elemento desordenado
        
        int i = v[v.length -2]; //a partir do vizinho dele à esquerda 
        //enquanto não achar um menor que ele, ele anda
        while(i >= 0 && v[i] > inserido ) {
            v[i + 1] = v[i];
            v[i] = inserido;
            i--;
        }
        v[i + 1] = inserido;
        
    }
   
    /**
    * O array  está ordenado exceto pelo primeiro elemento. Esse método
    * deve colocar o primeiro elemento em sua posição. Ao final da execução,
    * v deve estar ordenado.
    * Importante: seu algoritmo deve ser O(n);
    */
    public void inserePrimeiroOrdenado(int[] v) {
        // TODO: implementar
    }

    /**
    * Ordena um array de inteiros utilizando o insertion sort.
    */
    public void sort(int[] v) {
        // TODO: implementar
    }

    /**
    * Ordena um array de inteiros utilizando o insertion sort de maneira recursiva.
    * Pense que insertion sort são várias execuções da inserção ordenada e use
    * essa estratégia chamando recursivamente. 
    * Você não pode mudar a assinatura desse método, mas pode/deve criar outros
    * métodos para te auxiliar na recursão.
    */
    public void sortRecursivo(int[] v) {
        // TODO: implementar
    }  

}
