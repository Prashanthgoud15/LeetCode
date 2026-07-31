class Solution {
    static int findgcd(int a, int b){
        if(b==0){
            return a;
        }
        return findgcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        int max = nums[0];
        int min  = nums[0];
        for(int i=1;i<nums.length;i++){
           if(nums[i]>max){
            max = nums[i];
           }
           if(nums[i]<min){
            min = nums[i];
           }
        }
        return findgcd(min,max);
    }
}