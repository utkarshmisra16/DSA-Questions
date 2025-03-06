class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int freq[] = new int[101];
        Arrays.fill(freq, 0);
        int arr[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
        }
        for(int i=1; i<101; i++){
            freq[i] += freq[i-1];
        }
        for(int i=0; i<nums.length; i++){
            arr[i] = nums[i] > 0 ? freq[nums[i] - 1] : 0;
        }
        return arr;
    }
}