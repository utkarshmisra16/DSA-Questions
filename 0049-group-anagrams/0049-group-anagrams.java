class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        if(strs == null || n == 0)
            return new ArrayList<>();
        HashMap<String, List<String>> Map = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!Map.containsKey(key)){
                Map.put(key, new ArrayList<>());
            }
            Map.get(key).add(s);
        }
        return new ArrayList<>(Map.values());
    }
}