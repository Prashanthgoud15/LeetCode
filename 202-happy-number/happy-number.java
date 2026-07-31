class Solution {
    public boolean isHappy(int n) {
       int sum;
       do{
        sum=0;
        while(n!=0){
         int r = n%10;
         sum = sum+r*r;
         n=n/10;
        }
        n=sum;
       } while(sum>6);
       if(sum==1){
        return true;
       }
       else{
        return false;
       }
    }
}