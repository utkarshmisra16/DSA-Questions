class Solution {
    public int minLength(String s) {
        Stack <Character> st = new Stack<>();
        int n = s.length(); 
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
                continue;
            }
            if(st.peek()=='A' && ch=='B'){
                    st.pop();
            }
            else if(st.peek()=='C' && ch=='D'){
                    st.pop();
            }
            else
            st.push(ch);
        }
        return st.size();
    }
}