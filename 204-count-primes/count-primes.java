import java.util.*;
class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        boolean prime[] = new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0] = false;
        prime[1] = false;
        for(int i=2;(long)i*i<n;i++){
            if(prime[i]){
                for(long j=(long)i*i;j<n;j+=i){
                   prime[(int)j]=false;
                }
            }
        }
        int c=0;
        for(int i=2;i<n;i++){
            if(prime[i]){
                c++;
            }
        }
        return c;
       
    }
}