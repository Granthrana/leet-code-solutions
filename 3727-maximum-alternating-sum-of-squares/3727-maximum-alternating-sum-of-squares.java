class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n =nums.length;
        long sum =0;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        for(int j=0;j<n;j++){
            if(j<n/2){
                sum -= nums[j];
            }else{
                sum += nums[j];
            }
        }
        return sum;
    }
}