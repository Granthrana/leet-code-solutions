class Solution {
    public int minMoves2(int[] nums) {
      int n=nums.length;
      int count =0;
      Arrays.sort(nums);
      int m = nums[n/2];
      for(int i=0;i<n;i++){
        count += Math.abs(nums[i] - m);
      }
      return count;
    }
}