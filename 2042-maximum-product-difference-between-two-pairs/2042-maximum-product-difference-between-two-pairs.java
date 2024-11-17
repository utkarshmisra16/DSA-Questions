class Solution {
    public int maxProductDifference(int[] nums) {
       Arrays.sort(nums);
       int sum = 0;
       int n = nums.length;
       for(int i=0; i<n; i++){
            sum = Math.abs((nums[0]*nums[1]) - (nums[n-1]*nums[n-2]));
       }
        return sum; 
    }
}