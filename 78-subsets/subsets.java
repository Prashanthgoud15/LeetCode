class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        generate(nums,0,res,temp);
        return res;

    }
    public  void generate(int nums[],int index, List<List<Integer>> res,List<Integer> temp){
        res.add(new ArrayList(temp));
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            generate(nums,i+1,res,temp);
            temp.remove(temp.size()-1);
        }

    }
}