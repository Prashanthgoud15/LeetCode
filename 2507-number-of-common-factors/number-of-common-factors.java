class Solution {
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public int commonFactors(int a, int b) {

            int g = gcd(a,b);
            int c =0;
            for(int i=1;i<=g;i++){
                if(g%i==0){
                    c++;
                }
            }
            return c;
    }
}