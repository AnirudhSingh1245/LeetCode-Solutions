class Solution {
    public int climbStairs(int n) {
        int a=1,b=1;
        while(n-->0){
            int next=a+b;
            a=b;
            b=next;
        }
        return a;
    }
}