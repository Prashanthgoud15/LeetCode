class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length;
        // int t = n*(n+1)/2;
        // int s = 0;
        // for(int i : nums){
        //     s+=i;
        // }
        // int res = t-s;
        // return res;

        int n = nums.length;
        int x1=0,x2=0;
        for(int i=1;i<n+1;i++){
            x1^=i;
        }
        for(int num : nums){
            x2^=num;
        }
        return x1^x2;
    }
}