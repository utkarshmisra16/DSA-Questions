class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int suffix = 1;
        Arrays.fill(res, 1);
        for(int i=1; i<n; i++){
            res[i] = res[i-1] * nums[i-1];
        }
        for(int i=n-2; i>=0; i--){
            suffix *= nums[i+1]; 
            res[i] = res[i] * suffix;
        }
        return res;
    }
}