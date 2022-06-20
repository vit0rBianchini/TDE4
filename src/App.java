import java.util.Random;

public class App {
    private static float tempoOrdenado;
    private float tempoParialmenteOrdenado;
    private static float tempoAleatorio; 


    public static void main(String[] args) throws Exception {
        long start;
        int n = 1000000;
        
        int[] vetorInt = new int[n];
        
        int[] vetorAleatorioInt = insereAleatorio(vetorInt, n);
        int[] vetorDescenteInt = insereDecrescente(vetorInt, n);

        float[] vetorFloat= new float[n];

        float[] vetorAleatorioFloat= insereAleatorio(vetorFloat, n);
        float[] vetorDescenteFloat= insereAleatorio(vetorFloat, n);

        double[] vetorDouble= new double[n];

        double[] vetorAleatorioDouble= insereAleatorio(vetorDouble, n);
        double[] vetorDescenteDouble= insereAleatorio(vetorDouble, n);

        // QUICKSORT

        //start = System.currentTimeMillis();
        //Quicksort.quickSort(vetorAleatorioInt, 0, n - 1);
        //tempoAleatorio = (float) (System.currentTimeMillis() - start) / 1000;

        //System.out.println("Tempo de ordenação aleatório: " + tempoAleatorio + " segundos");

        //start = System.currentTimeMillis();
        //Quicksort.quickSort(vetorDescenteInt, 0, n - 1);
        //tempoOrdenado = (float) (System.currentTimeMillis() - start) / 1000;

        //System.out.println("Tempo de ordenação ordenado: " + tempoOrdenado + " segundos");


        // // SHELLSORT
        // start = System.currentTimeMillis();
        // ShellSort.shellsort(vetorAleatorio);
        // tempoAleatorio = (float) (System.currentTimeMillis() - start) / 1000;

        // System.out.println("Tempo de ordenação aleatório: " + tempoAleatorio + " segundos");


        // start = System.currentTimeMillis();
        // ShellSort.shellsort(vetorDescente);
        // tempoOrdenado = (float) (System.currentTimeMillis() - start) / 1000;

        // System.out.println("Tempo de ordenação ordenado: " + tempoOrdenado + " segundos");


        //BUCKETSORT

        start= System.currentTimeMillis();
        BucketSort b = new BucketSort();
        b.bucketSort(vetorAleatorioDouble, n);

        for (double i : vetorAleatorioDouble){
            System.out.print(i + "  ");
        }

        tempoAleatorio = (float) (System.currentTimeMillis() - start) / 1000;
        System.out.println("Tempo de ordenação aleatório: " + tempoAleatorio + " segundos");
        start = System.currentTimeMillis();

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
            a[i] = n - i;
        };
        return a;
    }



    public static float[] insereAleatorio(float[] a, int n){

        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            int randomPosition = random.nextInt(a.length);
            float temp = a[i];
            a[i] = a[randomPosition];
            a[randomPosition] = temp;
        }

            return a;
    }

    public static float[] insereDecrescente(float[] a, int n ){
        for( int i = 0; i < n; i++ ){
            a[i] = n - i;
        };
        return a;
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

    public static double[] insereDecrescente(double[] a, int n ){
        for( int i = 0; i < n; i++ ){
            a[i] = n - i;
        };
        return a;
    }
}
