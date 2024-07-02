import java.util.*;
public class Leetcode350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Use HashMap to count occurrences of each number in nums1
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> intersectList = new ArrayList<>();
        
        // Iterate through nums2 and check against the map
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                intersectList.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        
        // Convert ArrayList to array
        int[] result = new int[intersectList.size()];
        for (int i = 0; i < intersectList.size(); i++) {
            result[i] = intersectList.get(i);
        }
        
        return result;
    }
}
