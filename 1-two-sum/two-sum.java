class Solution {
    public int[] twoSum(int[] nums, int target) {
//         for(int i =0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i] + nums[j] == target){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return new int[] {-1,-1}; 
//     }
// }
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i = 1; i<nums.length; i++){
//             for(int j = i; j<nums.length; j++){
//                 if(nums[j]+nums[j-i]==target){
//                     return new int[] { j, j-i };
//                 }
//             }
//         }
//         return new int[2];
        
        // return new int[] {}; 
    Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int need = target-nums[i];
            if(map.containsKey(need)){
                return new int[]{map.get(need),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{1,-1};
    }
}


