class Solution {
    public int majorityElement(int[] nums) {
       // Boyer-Moore Voting Algorithm 
        int n=nums.length;
       int c=0;
       int num=0;
       for(int i=0;i<n;i++){
        if(c==0){
            num=nums[i];
            c=1;
        }else if(nums[i]==num){
            c++;
            

            }else{
                c--;
            }
        }
        int c1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==num){
                c1++;
            }
        if(c1>n/2){
            return num;
        }
       }return -1;
    }
}