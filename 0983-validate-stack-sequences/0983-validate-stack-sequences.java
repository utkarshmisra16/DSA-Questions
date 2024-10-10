class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        // Stack <Integer> st = new Stack<>();
        // int j=0;
        // if(pushed.length != popped.length)
        //     return false;
        // for(int i=0; i<pushed.length; i++){
        //     st.push(pushed[i]);
        
        // while(!st.isEmpty() && j != popped.length){
        //     if(st.peek() == popped[j]){
        //         st.pop();
        //         j++;
        //     }
        //     else{
        //         break;
        //     }
        // }
        // }
        // return st.isEmpty();
// ...................without using stack.................    
    
    int i=0;
    int j=0;
    for(int x : pushed){
        pushed[i] = x;
        while(i>=0 && pushed[i] == popped[j]){
            i--;
            j++;
        }
        i++;
    }
    return i==0;
    }
}