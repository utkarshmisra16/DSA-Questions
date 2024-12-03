class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones=0;
        for(char ch : s.toCharArray()){
            if(ch == '1')
                ones++;
        }
        int zeros = s.length() - ones;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<ones-1; i++){
            sb.append('1');
         }
        for(int i=0; i<zeros; i++){
            sb.append('0');
        }
        sb.append('1');
        return sb.toString();

    }
}