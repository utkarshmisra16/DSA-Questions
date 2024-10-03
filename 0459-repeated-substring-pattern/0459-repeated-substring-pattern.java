class Solution {
    public boolean repeatedSubstringPattern(String s) {
      int n = s.length();
        for(int i=n/2; i>=1; i--){
            if(n%i==0){
                int times = n/i;
                StringBuilder sb = new StringBuilder();
                String pattern = s.substring(0,i);
                while(times>0){
                    sb.append(pattern);
                    times--;
                }
                if(s.equals(sb.toString()))
                    return true;
            }
        }
    return false;  
    }
}