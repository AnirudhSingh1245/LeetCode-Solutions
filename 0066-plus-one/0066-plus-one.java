import java.util.Arrays;
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] digitss=new int[digits.length+1];       
        if(digits[0]<9){
            digitss[0]++;
        }
        else{
            digitss[0]=1;
        }
        return digitss;

    }
}