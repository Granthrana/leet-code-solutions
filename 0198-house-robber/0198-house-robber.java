class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int max=0;
        int cmax=0;
        for(int i=0;i<n;i++){
            int x=nums[i]+max;
            
            int temp = Math.max(x,cmax);
            max=cmax;
            cmax=temp;

        }
        return cmax;
    }
}