class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        if(strs == null || n == 0)
            return new ArrayList<>();
        HashMap<String, List<String>> Map = new HashMap<>();
        for(String s : strs){
            String freq = frequency(s);
            if(Map.containsKey(freq)){
                Map.get(freq).add(s);
            }
            else{
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                Map.put(freq, list);
            }
        }
        return new ArrayList<>(Map.values());
    }

    public String frequency(String strs){
        int arr[] = new int[26];
        for(char ch : strs.toCharArray()){
            arr[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder("");
        char ch = 'a';
        for(int i : arr){
            sb.append(ch);
            sb.append(i);
            ch++;
        }
        return sb.toString();
    }
}