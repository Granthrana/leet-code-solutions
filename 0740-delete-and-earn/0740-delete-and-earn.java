class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        int max = 0;

        for (int num : nums) {
            max = Math.max(max, num);
        }

        int[] arr = new int[max + 1];

        for (int num : nums) {
            arr[num] += num;
        }

        return solve(arr, 0, max);
    }

    public int solve(int[] nums, int start, int end) {
        int prev = 0;
        int prev2 = 0;

        for (int i = start; i <= end; i++) {
            int take = nums[i] + prev2;
            int notTake = prev;

            int curr = Math.max(take, notTake);

            prev2 = prev;
            prev = curr;
        }

        return prev;
    }
}