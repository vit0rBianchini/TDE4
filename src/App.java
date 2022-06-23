import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class App {
    private static float tempoOrdenado;
    private float tempoParialmenteOrdenado;
    private static float tempoAleatorio; 


    public static void main(String[] args) throws Exception {
        long start;

        Scanner input = new Scanner(System.in);
        System.out.println("Número de jada: ");
        int n = input.nextInt();

        input.close();

        int[] aleatorio, decrescente = new int[n], copia = new int[n], quaseOrdenado = new int[n];

        aleatorio = randomizeArray(IntStream.rangeClosed(1, n).toArray());
        System.arraycopy(aleatorio, 0, copia, 0, copia.length);
        Arrays.sort(copia);
        System.arraycopy(copia, 0, quaseOrdenado, 0, quaseOrdenado.length);
        trocarAleatorio(quaseOrdenado, 4);
        reverseArray(copia);
        System.arraycopy(copia, 0, decrescente, 0, copia.length);
        

        //double[] vetorDouble= new double[(int) n];
        //double[] vetorAleatorioDouble= insereAleatorio(vetorDouble, n);
        //double[] vetorDecrescenteDouble= insereAleatorio(vetorDouble, n);

        System.out.println("+----------------------------------------------------------------+");
        System.out.println("|  Tamanho do conjunto:"+n);
        System.out.println("|               |"+"        Tempos obtidos pelos algoritimos        "+"|");
        System.out.println("|   Algoritmo   | Quase ordenado |  Desordenado  |   Ord. Desc   |");

        // SHELLSORT
        System.arraycopy(aleatorio, 0, copia, 0, copia.length);
        start = System.currentTimeMillis();
        ShellSort.shellsort(copia);
        tempoAleatorio = (float) (System.currentTimeMillis() - start) / 1000;

        System.arraycopy(decrescente, 0, copia, 0, copia.length);
        start = System.currentTimeMillis();
        ShellSort.shellsort(copia);
        tempoOrdenado = (float) (System.currentTimeMillis() - start) / 1000;

        String mensagem = String.format("|   SHELLSORT   | Quase ordenado |     %.3fs    |     %.3fs    |", tempoAleatorio, tempoOrdenado);
        
        System.out.println(mensagem);
        
        
        
        //QUICKSORT
        System.arraycopy(aleatorio, 0, copia, 0, copia.length);
        start = System.currentTimeMillis();
        Quicksort.quickSort(copia);
        tempoAleatorio = (float) (System.currentTimeMillis() - start) / 1000;
        
        System.arraycopy(decrescente, 0, copia, 0, copia.length);
        start = System.currentTimeMillis();
        Quicksort.quickSort(copia);
        tempoOrdenado = (float) (System.currentTimeMillis() - start) / 1000;
        
        mensagem = String.format("|   QUICKSORT   | Quase ordenado |     %.3fs    |     %.3fs    |", tempoAleatorio, tempoOrdenado);
        
        System.out.println(mensagem);

        // HEAPSORT
        HeapSort h = new HeapSort();
        
        System.arraycopy(aleatorio, 0, copia, 0, copia.length);
        start = System.currentTimeMillis();
        h.sort(copia);
        tempoAleatorio = (float) (System.currentTimeMillis() - start) / 1000;
        
        System.arraycopy(decrescente, 0, copia, 0, copia.length);
        start = System.currentTimeMillis();
        h.sort(copia);
        tempoOrdenado = (float) (System.currentTimeMillis() - start) / 1000;

        mensagem = String.format("|   HEAPSORT    | Quase ordenado |     %.3fs    |     %.3fs    |", tempoAleatorio, tempoOrdenado);
        System.out.println(mensagem);
        

        // RADIXSORT
        RadixSort rs = new RadixSort();
        System.arraycopy(aleatorio, 0, copia, 0, copia.length);
        int size = copia.length;

        start = System.currentTimeMillis();
        rs.radixSort(copia, size);
        tempoAleatorio = (float) (System.currentTimeMillis() - start) / 1000;
        
        System.arraycopy(decrescente, 0, copia, 0, copia.length);
        start = System.currentTimeMillis();
        rs.radixSort(copia, size);
        tempoOrdenado = (float) (System.currentTimeMillis() - start) / 1000;

        mensagem = String.format("|   RADIXSORT   | Quase ordenado |     %.3fs    |     %.3fs    |", tempoAleatorio, tempoOrdenado);
        System.out.println(mensagem);
        
        // SHAKER SHORT
        
        // System.arraycopy(aleatorio, 0, copia, 0, copia.length);
        // start = System.currentTimeMillis();
        // ShakerSort.shakerSort(copia);
        // tempoAleatorio = (float) (System.currentTimeMillis() - start) / 1000;
        
        // System.arraycopy(decrescente, 0, copia, 0, copia.length);
        // start = System.currentTimeMillis();
        // ShakerSort.shakerSort(copia);
        // tempoOrdenado = (float) (System.currentTimeMillis() - start) / 1000;
        
        // mensagem = String.format("|  SHAKERSHORT  | Quase ordenado |     %.3fs    |     %.3fs    |", tempoAleatorio, tempoOrdenado);
        // System.out.println(mensagem);
        
        // GnomeSort
        System.arraycopy(aleatorio, 0, copia, 0, copia.length);
        start = System.currentTimeMillis();
        GnomeSort.gnomeSort(copia, copia.length);
        tempoAleatorio = (float) (System.currentTimeMillis() - start) / 1000;
        
        System.arraycopy(decrescente, 0, copia, 0, copia.length);
        start = System.currentTimeMillis();
        GnomeSort.gnomeSort(copia, copia.length);
        tempoOrdenado = (float) (System.currentTimeMillis() - start) / 1000;
        
        mensagem = String.format("|   GNOMESORT   | Quase ordenado |     %.3fs    |     %.3fs    |", tempoAleatorio, tempoOrdenado);
        System.out.println(mensagem);

        // SELECTSORT
        System.arraycopy(aleatorio, 0, copia, 0, copia.length);
        start = System.currentTimeMillis();
        SelectionSort.selectionSort(copia);
        tempoAleatorio = (float) (System.currentTimeMillis() - start) / 1000;
        
        System.arraycopy(decrescente, 0, copia, 0, copia.length);
        start = System.currentTimeMillis();
        SelectionSort.selectionSort(copia);
        tempoOrdenado = (float) (System.currentTimeMillis() - start) / 1000;
        
        mensagem = String.format("|   SELECTSORT  | Quase ordenado |     %.3fs    |     %.3fs    |", tempoAleatorio, tempoOrdenado);
        System.out.println(mensagem);

    }
        
    private static int[] randomizeArray(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomPosition = random.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }

        return array;
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

    private static int[] trocarAleatorio(int[] array, int trocas) {
        Random r = new Random();

        int s1, s2, aux;

        for (int i = 0; i < trocas; i++) {
            s1 = r.nextInt(array.length - 1);
            s2 = r.nextInt(array.length - 1);
            aux = array[s1];
            array[s1] = array[s2];
            array[s2] = aux;
        }

        return array;
    }

    private static void reverseArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; ++i) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}
