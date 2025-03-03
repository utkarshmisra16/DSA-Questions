class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        if(strs == null || n == 0)
            return new ArrayList<>();
        HashMap<String, List<String>> Map = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            
            String str = new String(ch);         
            if(!Map.containsKey(str)){
                Map.put(str, new ArrayList<>());
            }
            Map.get(str).add(s);
        }
        return new ArrayList<>(Map.values());
    }
}