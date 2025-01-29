class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int l=0, r=n-1, count=0;
        while(l < r){
        int sum = nums[l] + nums[r];
        if(sum==k){
            count++;
            l++;
            r--;
        }
        else if(sum < k)
            l++;
        else if(sum > k)
            r--;
        }
        return count;
    }
}