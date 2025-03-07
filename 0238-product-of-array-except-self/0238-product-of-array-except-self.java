class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int suffix[] = new int[n];
        int prefix[] = new int[n];
        suffix[n-1] = 1;
        prefix[0] = 1;
        // Arrays.fill(res, 1);
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        for(int i=n-2; i>=0; i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }
        for(int i=0; i<n; i++){
            res[i] = suffix[i] * prefix[i];
        }
        return res;
    }
}