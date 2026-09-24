import java.util.Arrays;
import java.lang.String;
class Solution {
    public boolean isAnagram(String s, String t) {
        int count=0;
        char[] ss=s.toCharArray();
        char[] tt=t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        if(ss.length!=tt.length){
            return false;
        }
        else{
        for(int i=0;i<ss.length;i++){
                if(ss[i]!=tt[i]){
                    return false;
                }
        }
        }
        return true;
     
    }
}