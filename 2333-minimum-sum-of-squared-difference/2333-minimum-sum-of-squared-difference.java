class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long) k1 + k2;
        int[] freq = new int[100001];
        int max = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            freq[diff]++;
            max = Math.max(max, diff);
        }
        for (int i = max; i > 0 && k > 0; i--) {
            if (freq[i] == 0) {
                continue;
            }
            int next = i - 1;
            long move = Math.min(k, (long) freq[i]);
            freq[i] -= (int) move;
            freq[next] += (int) move;
            k -= move;
        }
        long ans = 0;
        for (int i = 1; i <= max; i++) {
            ans += (long) i * i * freq[i];
        }
        return ans;
    }
}