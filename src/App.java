import java.util.Random;

public class App {
    private static float tempoOrdenado;
    private float tempoParialmenteOrdenado;
    private static float tempoAleatorio; 


    public static void main(String[] args) throws Exception {
        long start;
//Olá, eu voutacar no github
        int n = 10000;
        
        int[] vetor = new int[n];
        
        int[] vetorAleatorio = insereAleatorio(vetor, n);
        int[] vetorDescente = insereDecrescente(vetor, n);

        // // SHELLSORT
        // start = System.currentTimeMillis();
        // ShellSort.shellsort(vetorAleatorio);
        // tempoAleatorio = (float) (System.currentTimeMillis() - start) / 1000;

        // System.out.println("Tempo de ordenação aleatório: " + tempoAleatorio + " segundos");


        // start = System.currentTimeMillis();
        // ShellSort.shellsort(vetorDescente);
        // tempoOrdenado = (float) (System.currentTimeMillis() - start) / 1000;

        // System.out.println("Tempo de ordenação ordenado: " + tempoOrdenado + " segundos");

        // QUICKSORT

        start = System.currentTimeMillis();
        Quicksort.quickSort(vetorAleatorio, 0, n - 1);
        tempoAleatorio = (float) (System.currentTimeMillis() - start) / 1000;

        System.out.println("Tempo de ordenação aleatório: " + tempoAleatorio + " segundos");

        start = System.currentTimeMillis();
        Quicksort.quickSort(vetorDescente, 0, n - 1);
        tempoOrdenado = (float) (System.currentTimeMillis() - start) / 1000;

        System.out.println("Tempo de ordenação ordenado: " + tempoOrdenado + " segundos");


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
