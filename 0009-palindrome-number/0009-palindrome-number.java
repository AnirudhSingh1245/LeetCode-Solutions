class Solution {
    public boolean isPalindrome(int x) {
        int xx=x;
        long reverse=0;
        while(x>0){
            int k=x%10;
            reverse=reverse*10+k;
            x/=10;
        }
        if(reverse==xx){
            return true;
        }
        return false;
    }
}