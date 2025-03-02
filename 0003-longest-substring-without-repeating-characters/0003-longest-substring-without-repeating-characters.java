class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character, Integer> map = new HashMap<>();
        int maxLen=Integer.MIN_VALUE, ws=0, we=0, n=s.length();

        while(we<n){
            char ch = s.charAt(we);
            if(map.containsKey(ch) && map.get(ch)>=ws){
                ws = map.get(ch) + 1;
            }
            map.put(ch,we);
            maxLen = Math.max(maxLen, we-ws+1);
            we++;
        }
        return (maxLen == Integer.MIN_VALUE) ? 0 : maxLen;
    }
}