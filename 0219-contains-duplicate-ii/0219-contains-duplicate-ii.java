import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // If the number already exists
            if (map.containsKey(nums[i])) {
                // Check index difference
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            // Update latest index of the number
            map.put(nums[i], i);
        }

        return false;
    }
}