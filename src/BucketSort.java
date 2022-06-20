import java.util.ArrayList;

public class BucketSort{

    public ArrayList<Float>[] bucketList;              //array de arraylists

    public void bucketSort(float[] array, int n){
        n= array.length;
        bucketList= new ArrayList[n];       // dentro dos colchetes é declarada a dimensão da arrayList

        //criação dos buckets, ArrayLists dentro da array "bucketList"
        for(int i=0; i < n; i++){
            bucketList[i] = new ArrayList<Float>(); //cada um desses será um bucket
        }

        //adicionar os elementos em seus respectivos buckets
        for(int i=0; i<n; i++){
            int indiceBL = (int) (array[i] *n);
            bucketList[indiceBL].add(array[i]);
        }

        //organizar os elementos dentro de cada bucket
        for(int i=0; i<n; i++){
            ShellSort.shellsort(array);
            //algoritmo de ordenamento((bucket[i]));
        }


        //não entendi oq ta acontecendo aqui ainda, mas é pra recuperar o array ordenado.
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0, size = bucketList[i].size(); j< size; j++) {
            array[index++] = bucketList[i].get(j);
            }
        }
    }
}