class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        int count = 1;
        int sR = 0;
        int eR = matrix.length-1;
        int sC = 0;
        int eC = matrix[0].length-1;
        while(sR <= eR && sC <= eC){
        for(int i=sC; i<=eC; i++){
            matrix[sR][i]=count++;
        }

        for(int i=sR+1; i<=eR; i++){
            matrix[i][eC]=count++;
        }

        for(int i=eC-1; i>=sC; i--){
            if(sR==eR){
            break;
            }
            matrix[eR][i]=count++;
        }

        for(int i=eR-1; i>=sR+1; i--){
            if(sC==eC){
            break;
            }
            matrix[i][sC]=count++;
        }
        sR++;
        sC++;
        eR--;
        eC--;
    }
    return matrix;
    }
}