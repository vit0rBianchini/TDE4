import java.util.ArrayList;

//public class BucketSort{               
//
//    public static void bucketSort(float[] array, int tamanho){
//        ArrayList<Float>[] bucketList = new ArrayList[tamanho];   //array de arraylists; dentro dos colchetes é declarada a dimensão da //arrayList
//
//        //criação dos buckets, ArrayLists dentro da array "bucketList"
//        for(int i=0; i < tamanho; i++){
//            bucketList[i] = new ArrayList<Float>(); //cada um desses será um bucket
//        }
//
//        //adicionar os elementos em seus respectivos buckets
//        for(int i=0; i<tamanho; i++){
//            int indiceBL = (int) (array[i] * tamanho);
//            bucketList[indiceBL].add(array[i]);
//        }
//
//        //organizar os elementos dentro de cada bucket
//        for(int i=0; i<tamanho; i++){
//            ShellSort.shellsort(array);
//            //algoritmo de ordenamento((bucket[i]));
//        }
//
//
//        //não entendi oq ta acontecendo aqui ainda, mas é pra recuperar o array ordenado.
//        int index = 0;
//        for (int i = 0; i < tamanho; i++) {
//            for (int j = 0, size = bucketList[i].size(); j< size; j++) {
//            array[index++] = bucketList[i].get(j);
//            }
//        }
//
//        for(int i=0; i< bucketList.length; i++){
//            for(int j=0; j< bucketList[i].size(); j++){
//                System.out.println(bucketList[j]);
//            }
//            
//        }
//    }
//
//    //public void bucketSort(float[] arr, int n) {
//    //    if (n <= 0)
//    //        return;
//    //    @SuppressWarnings("unchecked")
//    //    ArrayList<Float>[] bucket = new ArrayList[n];
//    //
//    //    // Create empty buckets
//    //    for (int i = 0; i < n; i++)
//    //        bucket[i] = new ArrayList<Float>();
//    //
//    //    // Add elements into the buckets
//    //    for (int i = 0; i < n; i++) {
//    //      int bucketIndex = (int) arr[i] * n;
//    //        bucket[bucketIndex].add(arr[i]);
//    //    }
//    //
//    //    // Sort the elements of each bucket
//    //    for (int i = 0; i < n; i++) {
//    //        ShellSort.shellsort((bucket[i]));
//    //    }
//    //
//    //    // Get the sorted array
//    //    int index = 0;
//    //    for (int i = 0; i < n; i++) {
//    //        for (int j = 0, size = bucket[i].size(); j < size; j++) {
//    //            arr[index++] = bucket[i].get(j);
//    //        }
//    //    }
//}


public class BucketSort {
  public void bucketSort(double[] arr, int n) {
    if (n <= 0)
      return;
    @SuppressWarnings("unchecked")
    ArrayList<Double>[] bucket = new ArrayList[n];

    // Create empty buckets
    for (int i = 0; i < n; i++)
      bucket[i] = new ArrayList<Double>();

    // Add elements into the buckets
    for (int i = 0; i < n; i++) {
      int bucketIndex = (int) arr[i] * n;
      bucket[bucketIndex].add(arr[i]);
    }

    // Sort the elements of each bucket
    for (int i = 0; i < n; i++) {
      ShellSort.shellsort((bucket[i]));
    }

    // Get the sorted array
    int index = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0, size = bucket[i].size(); j < size; j++) {
        arr[index++] = bucket[i].get(j);
      }
    }
  }

  // Driver code
  public static void main(String[] args) {
    int n = 1000000;
    double[] vetorFloat= new double[n];
    double[] vetorAleatorioFloat= insereAleatorio(vetorFloat, n);

    BucketSort b = new BucketSort();
    b.bucketSort(vetorAleatorioFloat, n);

    for (double i : vetorAleatorioFloat){
      System.out.print(i + "  ");
    }
  }

  public static double[] insereAleatorio(double[] a, int n){

    for (int i = 0; i < a.length; i++) {
        double numRandom= Math.random();
        double bbb = a[i];
        a[i] = numRandom;
        numRandom = bbb;
    }
        return a;
}
}