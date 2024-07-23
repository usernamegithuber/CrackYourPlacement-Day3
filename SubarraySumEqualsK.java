package CrackYourPlacementDay3;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static class Solution {
        public int subarraySum(int[] nums, int k) {
            // Create a HashMap to store the frequency of prefix sums
            HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
            // Initialize variables
            int sum = 0;
            int count = 0;
            // Handle the case where the sum of elements equals k and starts from index 0
            prefixSumMap.put(0, 1);

            // Iterate through the array
            for (int i = 0; i < nums.length; i++) {
                // Update the current prefix sum
                sum += nums[i];
                // Calculate the sum that should have been seen earlier
                int requiredSum = sum - k;
                // Increment the count by the frequency of the required sum
                count += prefixSumMap.getOrDefault(requiredSum, 0);
                // Update the frequency of the current prefix sum
                prefixSumMap.put(sum, prefixSumMap.getOrDefault(sum, 0) + 1);
            }

            return count;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 1};
        int k = 2;
        int result = solution.subarraySum(nums, k);
        System.out.println("The number of subarrays with sum " + k + " is: " + result);  // Output should be 2
    }
}

