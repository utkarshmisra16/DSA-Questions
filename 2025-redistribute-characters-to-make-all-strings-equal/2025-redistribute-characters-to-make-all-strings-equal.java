class Solution {
    public boolean makeEqual(String[] words) {
        int arr[] = new int[26];
        for(String word : words){
            for(char ch : word.toCharArray()){
                arr[ch-'a']++;
            }
        }  
        // for(int i=0; i<26; i++){
        //     if(arr[i]%words.length != 0)
        //         return false;
        // }

        // Map <Character, Integer> mp = new HashMap<>();
        // for(String word : words){
        //     for(char ch : word.toCharArray()){
        //         mp.put(ch, mp.getOrDefault(ch, 0)+1);
        //     }
        // }
        // for(int value : mp.values()){
        //     if(value%words.length != 0)
        //         return false;
        // }
        return Arrays.stream(arr).allMatch(c -> c % words.length == 0);
    }
}