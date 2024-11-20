class Solution {
    public int maxScore(String s) {
        int zeros=0;
        int ones=0;
        int res=Integer.MIN_VALUE;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == '1')
                ones++;
            else
                zeros++;
            res = Math.max(res, zeros-ones);
        }
        if(s.charAt(s.length()-1) == '1')
            ones++;
        
        return res+ones;
    }
}