class Solution {
    public int majorityElement(int[] nums) {
      int n=nums.length;
      int count=0,e=0;
      for(int i=0;i<n;i++){
          if(count==0){
            e=nums[i];
            count++;
          }else {
            if(e==nums[i]){
                count++;
            }else{
                count--;
            }
          }
      }
      return e;   
    }
}