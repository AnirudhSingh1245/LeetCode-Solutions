import java.lang.String;
class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
        int len=str.length-1;
        String lenn=str[len];
        return lenn.length();
    }
}