class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        while(l <= r){
            char currLeft = s.charAt(l);
            char currRight = s.charAt(r);
            if(!Character.isLetterOrDigit(currLeft))
                l++;
            else if(!Character.isLetterOrDigit(currRight))
                r--;
            else{
                if(Character.toLowerCase(currLeft) != Character.toLowerCase(currRight)){
                    return false;
                }
            l++;
            r--;
            }
        }
        return true;
    }
}