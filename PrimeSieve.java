
import java.util.Arrays;

public class PrimeSieve {
    public static boolean[] sieve = new boolean [1000];
    public static void main(String[] args) {
      
        Arrays.fill(sieve, true); //sets all values to true
        sieve[0] = false;
        sieve[1] = false;
        
        for(int i=2; i<=sieve.length;i++){
            for(int j=2*i; j< sieve.length; j+=i){
                sieve[j]=false;
            }
        }
       /* int j=2;
        for(int i=2; i<=999;i++){
            if(i%j==0){
                sieve[i]= false;
            }
            else{
                sieve[i] = true;
                j++;
            }
            
    } */
        int[] result = collectPrimes();
    System.out.println(Arrays.toString(result));
    
        printPrimeFactors(132, result);
}
public static int[] collectPrimes(){ 
        int n= 0;
        for (int q = 0; q <sieve.length; q++) {
            
            if (sieve[q] = true) {
                n++;
            }
        }
        int [] primes= new int[n];
           int j =0;
           for(int i=0; i<sieve.length; i++){
           if(sieve[i]=true){
               primes[j] = i;
               j++;
            }
      
        
    }
    return primes;
}

public static void printPrimeFactors(int j,int [] bob ){
    for(int i=0;i< bob.length;i++){
        while( j % bob[i]==0){
            int m=1;
            j=j/i;
            m++;

        System.out.println("Prime factorization of " + j +"is" + i + ":" + m);
    } 
        
    }
    
}
}