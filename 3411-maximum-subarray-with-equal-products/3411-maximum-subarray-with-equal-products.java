class Solution {
    public int maxLength(int[] nums) {
        int ans =0;
        for(int i=0;i<nums.length;i++) {
            long product=1;
            long gcd=nums[i];
            long lcm=nums[i];
            for (int j=i;j<nums.length;j++) {
                product *=nums[j];
                gcd =gcd(gcd,nums[j]);
                lcm =lcm(lcm,nums[j]);

                if(product==gcd * lcm) {
                    ans =Math.max(ans,j-i+1);
                }
            }
        }

        return ans;
    }
    long gcd(long a,long b){
        return b==0 ? a:gcd(b,a%b);
    }
    long lcm(long a,long b){
        return (a/gcd(a,b))*b;
    }
}
