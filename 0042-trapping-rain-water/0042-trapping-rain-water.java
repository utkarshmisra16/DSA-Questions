class Solution {
    public int trap(int[] height) {
        int n =height.length;
        int storedWater=0;
        if(n==0)
            return 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        

        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        rightMax[n-1] = height[n-1];
        for(int j=n-2; j>=0; j--){
                rightMax[j] = Math.max(rightMax[j+1], height[j]);
        }

        for(int i=0; i<n; i++){
            storedWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return storedWater;
    }
}