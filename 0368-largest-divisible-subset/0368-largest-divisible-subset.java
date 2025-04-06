import java.util.*;

public class Solution {
    public static List<Integer> largestDivisibleSubset(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        
        Arrays.sort(nums);  // Step 1: Sort the array
        int n = nums.length;
        int[] dp = new int[n]; // dp[i] stores the size of largest subset ending at index i
        int[] prev = new int[n]; // Track previous index for reconstruction
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);
        
        int maxSize = 0, maxIndex = -1;

        // Step 2: Build subsets using dynamic programming
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j; // Remember previous index
                }
            }
            if (dp[i] > maxSize) {
                maxSize = dp[i];
                maxIndex = i;
            }
        }

        // Step 3: Reconstruct largest subset
        List<Integer> result = new ArrayList<>();
        while (maxIndex != -1) {
            result.add(nums[maxIndex]);
            maxIndex = prev[maxIndex];
        }
        
        Collections.reverse(result); // Reverse to maintain sorted order
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 8, 16};
        System.out.println(largestDivisibleSubset(nums)); // Output: [1, 2, 4, 8, 16]
    }
}
