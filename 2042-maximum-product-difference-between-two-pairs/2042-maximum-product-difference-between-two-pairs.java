class Solution {
    public int maxProductDifference(int[] nums) {
        int L = Integer.MIN_VALUE;
        int secL = Integer.MIN_VALUE;
        int S = Integer.MAX_VALUE;
        int secS = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > L){
                secL = L;
                L = nums[i];
            }
            else
                secL = Math.max(secL, nums[i]);
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] < S){
                secS = S;
                S = nums[i];
            }
            else
                secS = Math.min(secS, nums[i]);
        }
        return Math.abs((L*secL) - (S*secS));
    }
}