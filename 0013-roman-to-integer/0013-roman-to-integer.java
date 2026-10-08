import java.util.Hashtable;
class Solution {
    public int romanToInt(String s) {
        Hashtable<String,Integer> hush=new Hashtable<>();
        hush.put("I",1);
        hush.put("V",5);
        hush.put("X",10);
        hush.put("L",50);
        hush.put("C",100);
        hush.put("D",500);
        hush.put("M",1000);
        int sum=0;
        String[] str=s.split("");
        for(int i=0;i<str.length;i++){
            int value=hush.get(str[i]);
            if(i<str.length-1 && value<hush.get(str[i+1])){
                sum-=value;
            }
            else{
                sum+=value;
            }
        }
        return sum;
    }
}