class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        int s=nums[0],h=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]<s){
                s=nums[i];
            }
            else if(nums[i]>h){
                h=nums[i];
            }
        }
         while (h != 0) {
         int temp = h;
         h = s % h;
         s = temp;
            }
    return s;
    }
}