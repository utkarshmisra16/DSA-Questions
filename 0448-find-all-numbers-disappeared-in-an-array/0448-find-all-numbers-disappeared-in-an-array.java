class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List <Integer> res = new ArrayList<>();
        int n=nums.length;
        int freq[] = new int[n+1];
        Arrays.fill(freq, 0);
        for(int i=0; i<n; i++){
            freq[nums[i]]++; 
        }
        for(int i=1; i<=n; i++){
            if(freq[i] == 0)
            res.add(i);
        }
        return res;
    }
}