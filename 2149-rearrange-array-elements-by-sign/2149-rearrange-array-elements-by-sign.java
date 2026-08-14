class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] n1=new int[n/2];
        int[] n2=new int[n/2];
        int j=0;
        int k=0;
        for(int i=0;i<n;i++){
            
           
            if(nums[i]<0){
                n1[j]=nums[i];
                j++;
            }else{
             n2[k]=nums[i];
             k++;
            }

        }
        
            for(int i=0;i<n1.length;i++){
                nums[2*i]=n2[i];
                nums[2*i+1]=n1[i];

           
        }return nums;
        
    }
}