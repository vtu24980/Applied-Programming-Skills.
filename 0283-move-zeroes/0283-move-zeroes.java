public class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int lastNonZeroIndex = 0; // position to place the next non-zero element
        
        // Move all non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroIndex] = nums[i];
                lastNonZeroIndex++;
            }
        }
        
        // Fill the remaining positions with zeros
        for (int i = lastNonZeroIndex; i < n; i++) {
            nums[i] = 0;
        }
    }
}
