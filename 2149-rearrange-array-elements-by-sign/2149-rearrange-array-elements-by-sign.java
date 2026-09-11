class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int k = 0, j = 0;
        int[] a = new int[n / 2];
        int[] b = new int[n / 2];
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                a[k] = nums[i];
                k++;
            } else {
                b[j] = nums[i];
                j++;
            }
        }
        k = 0;
        j = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = a[k];
                k++;
            } else {
                nums[i] = b[j];
                j++;
            }
        }
        return nums;
    }
}