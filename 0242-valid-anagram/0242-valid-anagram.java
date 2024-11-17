class Solution {
    public boolean isAnagram(String s, String t) {
       int arr[] = new int[26];
       for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            arr[ch-'a']++;
       }
       for(int i=0; i<t.length(); i++){
            char ch=t.charAt(i);
            arr[ch-'a']--;
        }
       boolean allzeros = Arrays.stream(arr).allMatch(element -> element == 0);
       return allzeros;
    }
}