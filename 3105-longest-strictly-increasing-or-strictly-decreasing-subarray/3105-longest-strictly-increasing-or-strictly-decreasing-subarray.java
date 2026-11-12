class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n= nums.length;
        int c=1,count=1,ans=1;
        for(int i=1;i<n;i++){
            if(nums[i-1]<nums[i]){
                c++;
            }else{
                c=1;
            }
             if(nums[i-1]>nums[i]){
                count++;
            }else{
                count=1;
            }
            ans=Math.max(ans,Math.max(count,c));
        }
        return ans;
    }
}