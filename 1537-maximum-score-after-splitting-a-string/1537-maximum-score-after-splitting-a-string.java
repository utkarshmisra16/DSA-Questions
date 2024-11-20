class Solution {
    public int maxScore(String s) {
        int tOnes=0;
        int res=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1')
                tOnes++;
        }
        int zeros=0;
        int ones=0;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == '1')
                ones++;
            else
                zeros++;

            int ROnes = tOnes - ones;
            res = Math.max(res, zeros+ROnes);
        }
        return res;
    }
}