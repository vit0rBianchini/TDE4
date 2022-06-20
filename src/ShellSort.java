import java.util.ArrayList;

public class ShellSort {
    public static void shellsort( int[] ks )
    {
        for( int gap = ks.length / 2; gap > 0;
            gap = gap == 2 ? 1 : (int) ( gap / 2.2 ) )
            for( int i = gap; i < ks.length; i++ )
            {
                Comparable tmp = ks[ i ];
                int j = i;

                for( ; j >= gap && tmp.compareTo( ks[ j - gap ] ) < 0; j -= gap ){
                    ks[ j ] = ks[ j - gap ];
                };
                ks[ j ] = (int) tmp;
            }
    }

    public static void shellsort(ArrayList<Double> ks )
    {
        for( int gap = ks.size() / 2; gap > 0;
            gap = gap == 2 ? 1 : (int) ( gap / 2.2 ) )
            for( int i = gap; i < ks.size(); i++ )
            {
                Comparable tmp = ks.get(i);
                int j = i;

                for( ; j >= gap && tmp.compareTo( ks.get(j - gap)) < 0; j -= gap ){
                    ks.set( j, ks.get( j - gap ));
                };
                ks.set(j, (double) tmp);
            }
    }
}
