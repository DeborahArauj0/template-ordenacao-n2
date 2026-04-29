public class InsertionSort implements SortingStrategy {

    /**
    * O array  está ordenado exceto pelo último elemento. Esse método
    * deve colocar o último elemento em sua posição.
    * Importante: seu algoritmo deve ser O(n).
    */
    public void insereUltimoOrdenado(int[] v) {
        // TODO: implementar
        int inserido = v[v.length -1]; //ultimo elemento desordenado
        
        int i = v.length -2; //a partir do vizinho dele à esquerda 
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

        int inserido = v[0]; //o primeiro, desordenado

        int i = 1;

        //{4, 1, 2, 3}
        while (i < v.length && v[i] < inserido){
            v[i - 1] = v[i];
            v[i] = inserido; 
            i++;
        }
        v[i - 1] = inserido;

    }

    /**
    * Ordena um array de inteiros utilizando o insertion sort.
    */
    public void sort(int[] v) {
        // TODO: implementar

        for (int i = 1; i < v.length -1; i++){

            int j = i; //controla o indice do vizinho

            while  (j > 0 && v[j] < v[i -1]){
                
                int aux = v[j -1]; 
                v[j - 1] = v[j];
                v[j] = aux;
                j--;
            }
        }

    }

    /**
    * Ordena um array de inteiros utilizando o insertion sort de maneira recursiva.
    * Pense que insertion sort são várias execuções da inserção ordenada e use
    * essa estratégia chamando recursivamente. 
    * Você não pode mudar a assinatura desse método,0 mas pode/deve criar outros
    * métodos para te auxiliar na recursão.
    */
    public void sortRecursivo(int[] v) {
        // TODO: implementar

        if (v == null || v.length <= 1) return;
        sortRecursivo(v, 1);
    }  

    public void swap(int[] v, int index){

        int aux = v[index - 1];    
        v[index - 1] = v[index];
        v[index] = aux;
        
    }

    public void sortRecursivo(int[] v, int index){

        if (v.length == index) return;

        int j = index;

        while (j > 0 && v[j] < v[j -1]){
            swap(v, j);
            j--;
        }

        sortRecursivo(v, index + 1);

    }
}