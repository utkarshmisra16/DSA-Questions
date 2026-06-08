class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int index = n-1;
        int[] res = new int[n];
        
        while(left <= right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                res[index] = nums[left]*nums[left];
                left++;
            }

            else{
                res[index] = nums[right]*nums[right];
                right--;
            }
            index--;
        }
        return res;
    }
}