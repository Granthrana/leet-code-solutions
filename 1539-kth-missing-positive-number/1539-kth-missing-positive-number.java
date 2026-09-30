class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int p = 1;
        int i = 0;
        int c = 0;
        while (i < n && c < k) {
            if (arr[i] == p) {
                p++;
                i++;
            } 
            else {
                c++;
                if (c == k) {
                    return p;
                }
                p++;
            }
        }
        return p + (k - c) - 1;
    }
}