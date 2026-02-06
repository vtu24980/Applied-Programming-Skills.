class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Build prefix sum array
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // Step 2: Calculate result for each index
        for (int i = 0; i < n; i++) {
            int leftSum = (i > 0) ? prefix[i - 1] : 0;
            int rightSum = prefix[n - 1] - prefix[i];

            int leftCount = i;
            int rightCount = n - i - 1;

            result[i] =
                    (nums[i] * leftCount - leftSum)
                  + (rightSum - nums[i] * rightCount);
        }

        return result;
    }
}
