class Solution {
    public int maxProduct(int[] nums) {
        // for(int i=0; i<nums.length; i++){
        //     int res=0;
        //     for(int j=i+1; j<nums.length; j++){
        //         res = Math.max(res, (nums[i]-1)*nums[j]-1);
        //     }
        // }
        // return res;
        int n=nums.length;
        Arrays.sort(nums);
        return ((nums[n-1]-1)*(nums[n-2]-1));
    }
}