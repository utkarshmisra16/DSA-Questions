class Solution {
    public int numSpecial(int[][] mat) {
        int rows[] = new int[mat.length];
        int col[] = new int[mat[0].length];
        int count=0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 1){
                    rows[i]++;
                    col[j]++;
                }
            }
        }
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 1 && rows[i]==1 && col[j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}