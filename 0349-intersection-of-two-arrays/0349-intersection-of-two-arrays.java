import java.util.ArrayList; 
import java.util.Collections; 
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> array=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i] && !array.contains(nums2[j])){
                    array.add(nums2[j]);
                }
            }
        }
        int[] arr=new int[array.size()];
        for(int i=0;i<array.size();i++){
            arr[i]=array.get(i);
        }
        return arr;
    }
}