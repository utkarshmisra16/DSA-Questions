class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> st = new ArrayList<>();
        int index = 0;
        for(int i=1; i<=n; i++){
            if(index == target.length)  break;
            st.add("Push");
            if(i == target[index]) index++;
            else st.add("Pop");
        } 
        return st;
    }
}