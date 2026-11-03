class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            count +=nums[n-1] - nums[i];
        }
        return count;
    }
}