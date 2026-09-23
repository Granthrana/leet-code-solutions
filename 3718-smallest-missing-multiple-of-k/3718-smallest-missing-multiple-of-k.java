class Solution {
    public int missingMultiple(int[] nums, int k) {

        int res = k;

        while (true) {

            boolean found = false;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == res) {
                    found = true;
                    break;
                }
            }

            if (found == false) {
                return res;
            }

            res = res + k;
        }
    }
}