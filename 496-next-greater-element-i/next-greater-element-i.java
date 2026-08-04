class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int t = nums1[i];
            boolean f = false;
            int ng = -1;
            for(int j=0;j<nums2.length;j++){
                if(t==nums2[j]){
                    f = true;
                }
                if(f && nums2[j]>t){
                    ng = nums2[j];
                    break;
                }
            }
            ans[i] = ng;
        }
        return ans;
    }
}