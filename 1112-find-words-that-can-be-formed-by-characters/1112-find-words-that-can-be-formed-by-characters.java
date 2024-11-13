class Solution {
    public int countCharacters(String[] words, String chars) {
        int arr[] = new int[26];
        for(char ch : chars.toCharArray()){
            arr[ch-'a']++;
        }

        int result=0;
        for(String s : words){
            int word[] = new int[26];
            for(char ch : s.toCharArray()){
                word[ch-'a']++;
            }
            boolean Ok=true;
            for(int i=0; i<26; i++){
                if(word[i] > arr[i]){
                    Ok=false;
                    break;
                }
            }
            if(Ok)
                result += s.length();
        }
        return result;
    }
}