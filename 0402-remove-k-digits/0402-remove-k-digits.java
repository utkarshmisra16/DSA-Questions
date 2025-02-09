class Solution {
    public String removeKdigits(String num, int k) {
        Stack <Character> st = new Stack<>();
        int n = num.length();
        for(char digit : num.toCharArray()){
            while(!st.isEmpty() && k>0 && digit < st.peek()){
                st.pop();
                k--;
            }
            st.push(digit);
        }

        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();

        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        if(sb.length()>0)
            return sb.toString();
        else
            return "0";
    }
}