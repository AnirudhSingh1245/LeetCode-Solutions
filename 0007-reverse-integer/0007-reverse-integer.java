class Solution {
    public int reverse(int x) {
        int reverse=0;
        int xx=x;
        if(x<0){
            x*=-1;
        }
        while(x>0){
            int s=x%10;
            if(reverse>214748364 || reverse==214748364 && s>7){return 0;}
            reverse=reverse*10+s;
            x/=10;
        }
        if(xx<0){
            reverse*=-1;
        }
        else if(x%10==0){x/=10;}
        return reverse;
    }
}