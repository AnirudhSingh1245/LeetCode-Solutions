import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int b=nums[nums.length-1];
        for(int i=0;i<b;i++){
            if(nums[i]!=i){
                return i;
           } 
        }
        return b+1;
    }
}