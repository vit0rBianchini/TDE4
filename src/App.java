import java.util.Random;

public class App {
    private static float tempoOrdenado;
    private float tempoParialmenteOrdenado;
    private static float tempoAleatorio; 


    public static void main(String[] args) throws Exception {
        long start;
        int n = 1000000;
        
        int[] vetor = new int[n];
        
        int[] vetorAleatorio = insereAleatorio(vetor, n);
        int[] vetorDescente = insereDecrescente(vetor, n);

        System.out.println("+--------------------------------------------------------------+");
        System.out.println("|  Tamanho do conjunto:"+n);
        System.out.println("|               |"+"       Tempos obtidos pelos algoritimos       "+"|");
        System.out.println("|   Algoritmo   | Quase ordenado |  Desordenado |  Ord. Desc   |");

        // // SHELLSORT
        start = System.currentTimeMillis();
        ShellSort.shellsort(vetorAleatorio);
        tempoAleatorio = (float) (System.currentTimeMillis() - start) / 1000;

        start = System.currentTimeMillis();
        ShellSort.shellsort(vetorDescente);
        tempoOrdenado = (float) (System.currentTimeMillis() - start) / 1000;

        String mensagem = String.format("|   SHELLSORT   | Quase ordenado |     %.3f    |     %.3f    |", tempoAleatorio, tempoOrdenado);

        System.out.println(mensagem);

        // QUICKSORT
        // start = System.currentTimeMillis();
        // int size = vetorAleatorio.length;
        // Quicksort.quickSort(vetorAleatorio, 0, size - 1);
        // tempoAleatorio = (float) (System.currentTimeMillis() - start) / 1000;

        // HEAPSORT
        HeapSort h = new HeapSort();

        start = System.currentTimeMillis();
        h.sort(vetorAleatorio);
        tempoAleatorio = (float) (System.currentTimeMillis() - start) / 1000;

        start = System.currentTimeMillis();
        h.sort(vetorDescente);
        tempoOrdenado = (float) (System.currentTimeMillis() - start) / 1000;

        mensagem = String.format("|   HEAPSORT    | Quase ordenado |     %.3f    |     %.3f    |", tempoAleatorio, tempoOrdenado);
        System.out.println(mensagem);
        

        // RADIXSORT
        RadixSort rs = new RadixSort();
        int size = vetorAleatorio.length;

        start = System.currentTimeMillis();
        rs.radixSort(vetorAleatorio, size);
        tempoAleatorio = (float) (System.currentTimeMillis() - start) / 1000;

        start = System.currentTimeMillis();
        rs.radixSort(vetorDescente, size);
        tempoOrdenado = (float) (System.currentTimeMillis() - start) / 1000;

        mensagem = String.format("|   RADIXSORT   | Quase ordenado |     %.3f    |     %.3f    |", tempoAleatorio, tempoOrdenado);
        System.out.println(mensagem);

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
}
