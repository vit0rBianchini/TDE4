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

    public static void shellsort( float[] ks )
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
}
