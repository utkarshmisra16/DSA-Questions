class Solution {
    public boolean isAnagram(String s, String t) {
       char c[] = s.toCharArray();
       char h[] = t.toCharArray();
       Arrays.sort(c);
       Arrays.sort(h);
       if(s.length() != t.length())
        return false;
       for(int i=0; i<s.length(); i++){
        if(c[i]!=h[i])
            return false;
       }
    return true;
    }
}