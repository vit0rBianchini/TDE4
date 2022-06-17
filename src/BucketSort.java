public class BucketSort{

   //public float[][] bucketList= new float[10][];

   //public int encontraDivisor(float[] a){

   //    int n = a.length;
   //    float valorMaximo= a.valorMaximo;
   //    float valorMinimo= a.valorMinimo;
   //    int divisor= (int) Math.ceil(valorMaximo + 1/10);
   //    return divisor;
   //}

   //public float[] bucketSort(float[] a){

   //    encontraDivisor(a);
   //    for(int i=0; i< a.length; i++){
   //        
   //        int j= (int) Math.floor(a[i] / 9);

   //        bucketList[j] = a[i];

   //    }

   //    return a;
   //}

    
    public float valorMaximo(float[] array){
        float valorMaximo= array[0];
        for(int i=1; i< array.length; i++){
            if(array[i] > valorMaximo){
                valorMaximo = array[i];
            }
        }

        return valorMaximo;
    }

    public float valorMinimo(float[] array){
        float valorMinimo= array[0];
        for(int i=0; i<array.length; i++){
            if(array[i] < valorMinimo){
                valorMinimo= array[i];
            }
        }

        return valorMinimo;
    }



}