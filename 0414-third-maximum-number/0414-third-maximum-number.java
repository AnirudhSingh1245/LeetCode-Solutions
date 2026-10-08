import java.util.Arrays;
class Solution {
    public int thirdMax(int[] nums) {
        int temp=0;   
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int duplicate=nums[i];
                if(nums[i]<nums[j]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        int duplicate=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                duplicate++;
            }
            if(duplicate==3){
                return nums[i];
            }
        }
        return nums[0];
    }
}