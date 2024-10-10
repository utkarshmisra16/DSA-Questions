class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack <Integer> st = new Stack<>();
        int j=0;
        if(pushed.length != popped.length)
            return false;
        for(int i=0; i<pushed.length; i++){
            st.push(pushed[i]);
        
        while(!st.isEmpty() && j != popped.length){
            if(st.peek() == popped[j]){
                st.pop();
                j++;
            }
            else{
                break;
            }
        }
        }
        return st.isEmpty();
    }
}