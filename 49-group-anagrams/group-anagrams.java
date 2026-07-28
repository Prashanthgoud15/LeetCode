class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] t = s.toCharArray();
            Arrays.sort(t);
            String k = new String(t);
            if(!map.containsKey(k)){
                map.put(k,new ArrayList<>());
            }
            map.get(k).add(s);
           
        }
        return new ArrayList<>(map.values());
    }
}