class Solution {
    public int maxProduct(int[] nums) {
        int ch1 = 0;
        int ch2 = 0;
        int maxRes = nums[0];
        int maxPos = nums[0];
        int minPos = nums[0];
        for(int i=1; i<nums.length; i++){
            ch1 = maxPos*nums[i];
            ch2 = minPos*nums[i];
            maxPos = Math.max(Math.max(nums[i], ch1), ch2);
            minPos = Math.min(Math.min(nums[i], ch1), ch2);
            maxRes = Math.max(Math.max(maxRes, maxPos), minPos);
        }
    return maxRes;
    }
}