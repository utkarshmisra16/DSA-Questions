class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int index = 0;
        int count = 0;
        int i = 0;
        while(i<n){
            char cc = chars[i];
            count=0;
            while(i<n && chars[i] == cc){
                count++;
                i++;
            }
            chars[index++] = cc;
            if(count>1){
                char[] s = Integer.toString(count).toCharArray();
                for(char ch : s){
                    chars[index++] = ch;
                }
            }
        }
        return index;
    }
}