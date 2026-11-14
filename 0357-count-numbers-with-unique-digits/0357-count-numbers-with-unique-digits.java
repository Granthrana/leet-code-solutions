class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n==0){
            return 1;
        }
        int[] dp=new int[n + 1];
        dp[0] =1;
        dp[1]=10;
        int c=9;
        int a=9;
        for (int i=2;i<=n;i++){
            c= c*a;
            dp[i] =dp[i-1]+c;
            a--;
            }
        return dp[n];
    }
}
