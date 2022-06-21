import java.util.Arrays;
import java.util.Random;

public class App {
    private static float tempoOrdenado;
    private float tempoParialmenteOrdenado;
    private static float tempoAleatorio; 


    public static void main(String[] args) throws Exception {
        long start;
        int n = 50000;
        
        int[] vetorInt = new int[(int) n];
        double[] vetorDouble= new double[(int) n];

        int[] vetorAleatorioInt = insereAleatorio(vetorInt, n);
        int[] vetorDecrescenteInt = insereDecrescente(vetorInt, n);
        

        double[] vetorAleatorioDouble= insereAleatorio(vetorDouble, n);
        double[] vetorDecrescenteDouble= insereAleatorio(vetorDouble, n);

        // QUICKSORT

        //start = System.currentTimeMillis();
        //Quicksort.quickSort(vetorAleatorioInt, 0, n - 1);
        //tempoAleatorio = (float) (System.currentTimeMillis() - start) / 1000;

        //System.out.println("Tempo de ordenação aleatório: " + tempoAleatorio + " segundos");

        //start = System.currentTimeMillis();
        //Quicksort.quickSort(vetorDecrescenteInt, 0, n - 1);
        //tempoOrdenado = (float) (System.currentTimeMillis() - start) / 1000;

        //System.out.println("Tempo de ordenação ordenado: " + tempoOrdenado + " segundos");


        //System.out.println("+--------------------------------------------------------------+");
        //System.out.println("|  Tamanho do conjunto:"+n);
        //System.out.println("|               |"+"       Tempos obtidos pelos algoritimos       "+"|");
        //System.out.println("|   Algoritmo   | Quase ordenado |  Desordenado |  Ord. Desc   |");

        // SHELLSORT
        //start = System.currentTimeMillis();
        //ShellSort.shellsort(vetorAleatorioInt);
        //tempoAleatorio = (float) (System.currentTimeMillis() - start) / 1000;

        //start = System.currentTimeMillis();
        //ShellSort.shellsort(vetorDecrescenteInt);
        //tempoOrdenado = (float) (System.currentTimeMillis() - start) / 1000;

        //String mensagem = String.format("|   SHELLSORT   | Quase ordenado |     %.3f    |     %.3f    |", tempoAleatorio, //tempoOrdenado);

        //System.out.println(mensagem);



        //QUICKSORT
        start = System.currentTimeMillis();
        
        int size = vetorAleatorioInt.length;

        // call quicksort() on array data
        Quicksort.quickSort(vetorAleatorioInt, 0, size - 1);
        tempoAleatorio = (float) (System.currentTimeMillis() - start) / 1000;

        System.out.println(Arrays.toString(vetorAleatorioInt));

        // HEAPSORT
        // HeapSort h = new HeapSort();

        // start = System.currentTimeMillis();
        // h.sort(vetorAleatorioInt);
        // tempoAleatorio = (float) (System.currentTimeMillis() - start) / 1000;

        // start = System.currentTimeMillis();
        // h.sort(vetorDecrescenteInt);
        // tempoOrdenado = (float) (System.currentTimeMillis() - start) / 1000;

        // mensagem = String.format("|   HEAPSORT    | Quase ordenado |     %.3f    |     %.3f    |", tempoAleatorio, tempoOrdenado);
        // System.out.println(mensagem);
        


        //BUCKETSORT

        //start= System.currentTimeMillis();
        //BucketSort b = new BucketSort();
        //b.bucketSort(vetorAleatorioDouble, n);

        //for (double i : vetorAleatorioDouble){
        //    System.out.print(i + "  ");
        //}

        //tempoAleatorio = (float) (System.currentTimeMillis() - start) / 1000;
        //System.out.println("Tempo de ordenação aleatório: " + tempoAleatorio + " segundos");
        //start = System.currentTimeMillis();



        // RADIXSORT
        // RadixSort rs = new RadixSort();
        // int size = vetorAleatorioInt.length;

        // start = System.currentTimeMillis();
        // rs.radixSort(vetorAleatorioInt, size);
        // tempoAleatorio = (float) (System.currentTimeMillis() - start) / 1000;

        // start = System.currentTimeMillis();
        // rs.radixSort(vetorDecrescenteInt, size);
        // tempoOrdenado = (float) (System.currentTimeMillis() - start) / 1000;

        // mensagem = String.format("|   RADIXSORT   | Quase ordenado |     %.3f    |     %.3f    |", tempoAleatorio, tempoOrdenado);
        // System.out.println(mensagem);

    }
        
    public static int[] insereAleatorio(int[] a, int n){

        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            int randomPosition = random.nextInt(a.length);
            int temp = a[i];
            a[i] = a[randomPosition];
            a[randomPosition] = temp;
        }

            return a;
    }
    
    public static int[] insereDecrescente(int[] a, int n ){
        for( int i = 0; i < n; i++ ){
            a[i] = (int) (n - i);
        };
        return a;
    }



    public static double[] insereAleatorio(double[] a, int n){

        for (int i = 0; i < a.length; i++) {
            double numRandom= Math.random();
            double posicaotemp = a[i];
            a[i] = numRandom;
            numRandom = posicaotemp;
        }
        return a;
    }

    public static double[] insereDecrescente(double[] a, int n ){
        for( int i = 0; i < n; i++ ){
            a[i] = n - i;
        };
        return a;
    }
}
