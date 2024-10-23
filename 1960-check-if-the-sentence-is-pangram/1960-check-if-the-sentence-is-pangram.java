class Solution {
    public boolean checkIfPangram(String sentence) {
        int arr[] = new int[26];
        Arrays.fill(arr, 0);
        for(int i=0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            int index = ch - 'a';
            arr[index]++;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                return false;
            }
        }
        return true;
    }
}