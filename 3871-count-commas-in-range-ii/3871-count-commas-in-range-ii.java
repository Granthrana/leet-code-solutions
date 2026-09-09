class Solution {
    public long countCommas(long n) {
        long res=0;
        long com=1000;;
        while(com<=n){
            res += n-com+1;
            com *=1000;
        }
        return res;
    }
}