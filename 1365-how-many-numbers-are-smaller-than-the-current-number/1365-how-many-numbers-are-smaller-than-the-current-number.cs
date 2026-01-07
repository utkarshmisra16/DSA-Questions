public class Solution {
    public int[] SmallerNumbersThanCurrent(int[] nums) {
        int n = nums.Length;
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if((j != i) && (nums[j]<nums[i]))
                    count++;
            }
            res[i] = count;
        }
        return res;
    }
}