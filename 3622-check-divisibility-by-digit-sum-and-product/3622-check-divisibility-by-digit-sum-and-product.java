class Solution {
    public boolean checkDivisibility(int n) {
        int sum =0;
        int product=1;
        int temp=n;
        while(temp!=0){
            int i =temp%10;
            sum += i;
            product =product*i;
            temp=temp/10;
        }
        int ans =sum+product;
        if(n%ans==0){
            return true;
        }else{return false;
        }
    }
}