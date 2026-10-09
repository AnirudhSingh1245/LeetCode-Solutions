class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr=new int[2];
        int[] arr2=new int[nums.length+1];
        int duplicate=0;
        int missing=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                     duplicate=nums[i];          
                }
            }
            arr2[i]=i+1;
        }
        arr2[nums.length-1]=nums.length;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(arr2[i]==nums[j]){
                    count++;
                }
            }
            if(count==0){
                missing=arr2[i];
            }
        }
        arr[0]=duplicate;
        arr[1]=missing;
        return arr;
    }
}