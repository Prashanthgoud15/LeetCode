class Solution {
    public int longestSubsequence(int[] nums) {

        // for(int i =0 ;i<nums.length;i++){
        //     for(int j =0;j<nums.length;j++){
        //         int res = nums[i] ^ nums[j];
        //         if(res!=0){
        //             return res;
        //         }else{
        //             return res+1;
        //         }
        //     }
        // }

        int res =0;
        int b =0;
        for(int  num : nums){
            res = res^num;
            if(num==0){
                b ++;
            }
        }
        if(res!=0){
            return nums.length;
        }
        if(b==nums.length){
            return 0;
        }
        return nums.length-1;

    }
}