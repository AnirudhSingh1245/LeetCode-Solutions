import java.lang.String;
class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        String temp="";
        for(int i=0;i<str.length-1;i++){
            for(int j=i+1;j<str.length;j++){
                if(str[i].charAt(str[i].length()-1)>str[j].charAt(str[j].length()-1)){
                    temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        for(int i=0;i<str.length;i++) {
            str[i]=str[i].substring(0,str[i].length()-1);
        }
        return String.join(" ",str);
    }
}