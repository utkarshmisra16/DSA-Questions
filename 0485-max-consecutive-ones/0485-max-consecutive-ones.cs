public class Solution {
    public int FindMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        int n = nums.Length;
        for(int i=0; i<n; i++){
            if(nums[i] == 1){
                count++;
                max = Math.Max(count, max);
            }
            else
                count=0;
        }
        return max;
    }
}