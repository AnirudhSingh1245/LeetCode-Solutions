class Solution {
    public int fib(int n) {
        int left=0,right=1;
        for(int i=0;i<n;i++){
           int fibo=right+left;
           left=right;
           right=fibo;
        }
        return left;
    }
}