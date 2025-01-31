class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int lSum=0;
        int rSum=0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i]; 
        }

        int i=0;
        while(i<nums.length){
            rSum = sum - lSum - nums[i];
            if(lSum == rSum){
                return i;
            }
            lSum +=  nums[i];
            i++;
        }
        return -1;
    }
}