class Solution {
    public int longestPalindrome(String s) {
        int len=0;
        boolean hasodd = false;
        int f[] = new int[128];
        for(char ch : s.toCharArray()){
            f[ch]++;
        }
        for(int c : f){
            if(c%2==0){
                len+=c;
            }else{
                len+=c-1;
                hasodd=true;
            }
        }
        if(hasodd){
            len+=1;
        }
        return len;
    }
}