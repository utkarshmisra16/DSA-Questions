class Solution {
    public boolean makeEqual(String[] words) {
        Map <Character, Integer> mp = new HashMap<>();
        for(String word : words){
            for(char ch : word.toCharArray()){
                mp.put(ch, mp.getOrDefault(ch, 0)+1);
            }
        }
        for(int value : mp.values()){
            if(value%words.length != 0)
                return false;
        }
        return true;
    }
}