class Solution {
    public int lengthOfLongestSubstring(String s) {
         if (s == null || s.length() == 0) return 0;

       

        Map<Character, Integer> lastIndex = new HashMap<>();
        int start = 0;
        int maxLen = 0;
         

        for (int  i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (lastIndex.containsKey(c) && lastIndex.get(c) >= start) {
                
                start = lastIndex.get(c) + 1;
            }
            lastIndex.put(c, i); 
            maxLen = Math.max(maxLen, i - start + 1);
        }
        return maxLen;
}
}    
