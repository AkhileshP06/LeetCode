import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxSum(int[] nums) {
        Map<Integer, Integer> maxDigits = new HashMap<>();

        int maxSum = -1;
        
        for (int num : nums) {
            int maxDigit = findMaxDigit(num);
            
            if (maxDigits.containsKey(maxDigit)) {
                maxSum = Math.max(maxSum, num + maxDigits.get(maxDigit));
            }
            
            maxDigits.put(maxDigit, Math.max(maxDigits.getOrDefault(maxDigit, -1), num));
        }
        
        return maxSum;
    }

    public int findMaxDigit(int num) {
        int maxDigit = 0;
        while (num > 0) {
            int digit = num % 10;
            maxDigit = Math.max(maxDigit, digit);
            num /= 10;
        }
        return maxDigit;
    }

    public static void main(String[] args) {
        int[] nums1 = {51, 71, 17, 24, 42};
        int[] nums2 = {1, 2, 3, 4};

        Solution solution = new Solution();
        int result1 = solution.maxSum(nums1);
        int result2 = solution.maxSum(nums2);

        System.out.println("Result 1: " + result1); // Output: 88
        System.out.println("Result 2: " + result2); // Output: -1
    }
}
