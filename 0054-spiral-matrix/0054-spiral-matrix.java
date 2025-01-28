class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList <Integer> list = new ArrayList<>();
        int sR = 0;
        int eR = matrix.length-1;
        int sC = 0;
        int eC = matrix[0].length-1;
        while(sR <= eR && sC <= eC){
        for(int i=sC; i<=eC; i++){
            list.add(matrix[sR][i]);
        }

        for(int i=sR+1; i<=eR; i++){
            list.add(matrix[i][eC]);
        }

        for(int i=eC-1; i>=sC; i--){
            if(sR==eR){
            break;
            }
            list.add(matrix[eR][i]);
        }

        for(int i=eR-1; i>=sR+1; i--){
            if(sC==eC){
            break;
            }
            list.add(matrix[i][sC]);
        }
        sR++;
        sC++;
        eR--;
        eC--;
    }
    return list;
    }
}