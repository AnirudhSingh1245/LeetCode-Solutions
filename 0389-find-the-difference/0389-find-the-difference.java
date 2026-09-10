import java.lang.*;
class Solution {
    public char findTheDifference(String s, String t) {
        char[] a = s.toCharArray();
        for(int i=0;i<t.length()-1;i++){
            int j;
            for(j=0;j<a.length;j++)
                if(t.charAt(i)==a[j]){
                 a[j]='0';
                    break;
                }
            
            if(j==a.length)
                return t.charAt(i);
        }
        return t.charAt(t.length()-1);
    }
}