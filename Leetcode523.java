import java.util.HashMap;
import java.util.Map;

public class Leetcode523 {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        
        // Map to store remainders of prefix sums when divided by k
        Map<Integer, Integer> remainderMap = new HashMap<>();
        // Initialize map with the remainder 0 and index -1
        remainderMap.put(0, -1);
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (k != 0)
                sum %= k; // Remainder of sum when divided by k
            
            // If the same remainder is found again with different indices, there exists a subarray
            if (remainderMap.containsKey(sum)) {
                int prevIndex = remainderMap.get(sum);
                // Subarray length should be at least 2
                if (i - prevIndex > 1)
                    return true;
            } else {
                remainderMap.put(sum, i);
            }
        }
        
        return false;
    }
}


