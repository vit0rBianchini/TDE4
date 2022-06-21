import java.util.ArrayList;

//talvez mudar o tipo pra retornar um double[]

public class BucketSort {
    public void bucketSort(double[] arr, int n) {
        ArrayList<Double>[] bucket = new ArrayList[n]; //criação da "bucketList"
        for (int i = 0; i < n; i++){
            bucket[i] = new ArrayList<Double>(); //criação dos "buckets"
        }

        for (int i = 0; i < n; i++) {
            int posicaoBucket = (int) arr[i] * n; //atribuição dos valores a seus buckets
            bucket[posicaoBucket].add(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            ShellSort.shellsort((bucket[i])); //aplicação de outro algoritmo para ordenar os itens nos buckets
        }
      
        // Get the sorted array
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0, size = bucket[i].size(); j < size; j++) {
                arr[index++] = bucket[i].get(j);
            }
        }
    }
}