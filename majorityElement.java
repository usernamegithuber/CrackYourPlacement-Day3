package CrackYourPlacementDay3;

import java.util.Arrays;

public class majorityElement {
    public static class Solution {
        public int MajorityElement(int[] nums) {
            // Sort the array
            Arrays.sort(nums);
            // Return the middle element, which is the majority element
            return nums[nums.length / 2];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 2, 3};
        int result = solution.MajorityElement(nums);
        System.out.println("The majority element is: " + result);  // Output should be 3
    }
}

