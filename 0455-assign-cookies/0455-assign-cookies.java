class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int n = g.length;
        int m = s.length;
        int i=0,j=0;
        while(i<n && j<m){
            if(s[j]>=g[i]){
                i++;
            }
            j++;
        }
    return i;
    }
}