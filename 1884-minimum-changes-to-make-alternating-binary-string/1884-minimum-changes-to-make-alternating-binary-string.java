class Solution {
    public int minOperations(String s) {
        int operation1 = 0; //10101010.....
        int operation0 = 0; //01010101.....
        for(int i=0; i<s.length(); i++){
            if(i%2==0){
                if(s.charAt(i)== '0')
                    operation1++;
                else
                    operation0++;
            }
            else{
                if(s.charAt(i)== '1')
                    operation1++;
                else
                    operation0++;
            }
        }
        return Math.min(operation0, operation1);
    }
}