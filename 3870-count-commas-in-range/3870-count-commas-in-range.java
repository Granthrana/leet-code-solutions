class Solution {
    public int countCommas(int n) {
        int max =0;
        if(n<1000){
            max=0;
        }else if (n>=1000){
            max=n-1000+1;
        }
        return max;
    }
    
}