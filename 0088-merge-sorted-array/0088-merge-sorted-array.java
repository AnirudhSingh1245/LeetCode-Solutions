class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mergee=new int[m+n];
        for(int i=0;i<m+n;i++){
            if(i<m){
                mergee[i]=nums1[i];
            }
            else{   
                mergee[i]=nums2[i-m];
            }
        }
        int temp;
        for(int i=0;i<(m+n)-1;i++){
            for(int j=i+1;j<m+n;j++){
                if(mergee[i]>mergee[j]){
                  temp=mergee[i];
                  mergee[i]=mergee[j];
                  mergee[j]=temp;
                }
            }
        }   
        for(int i=0;i<m+n;i++){ 
               nums1[i] = mergee[i];
        } 
    }
}