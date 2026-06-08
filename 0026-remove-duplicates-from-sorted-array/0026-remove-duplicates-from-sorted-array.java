class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=0;
        if(nums.length == 0)
            return nums.length;
        for(int j=1; j<n; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}