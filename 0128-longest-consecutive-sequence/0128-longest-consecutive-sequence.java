
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        int max = 0;

        for (int n : set) {
            if (!set.contains(n - 1)) {
                int count = 1;
                int x = n;

                while (set.contains(x + 1)) {
                    x++;
                    count++;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
}