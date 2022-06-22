import java.util.ArrayList;

//talvez mudar o tipo pra retornar um double[]

public class BucketSort {
    public void bucketSort(int[] arr, int numBuckets) {
        
        ArrayList<Integer>[] bucket = new ArrayList[numBuckets]; //criação da "bucketList"
        for (int i = 0; i < numBuckets; i++){
            bucket[i] = new ArrayList<Integer>(); //criação dos "buckets"
        }

        for (int i = 0; i < numBuckets; i++) {
            int posicaoBucket = (int) arr[i]; //atribuição dos valores a seus buckets
            bucket[posicaoBucket].add(arr[i]);
        }

        for (int i = 0; i < numBuckets; i++) {
            ShellSort.shellsort((bucket[i])); //aplicação de outro algoritmo para ordenar os itens nos buckets
        }

        // Get the sorted array
        int index = 0;
        for (int i = 0; i < numBuckets; i++) {
            for (int j = 0, size = bucket[i].size(); j < size; j++) {
                arr[index++] = bucket[i].get(j);
            }
        }
    }
}