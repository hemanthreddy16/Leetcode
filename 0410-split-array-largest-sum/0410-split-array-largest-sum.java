class Solution {
    public int splitArray(int[] nums, int k) {
        long low=0;
        long high=0;
        for(int num:nums){
            low=Math.max(low,num);
            high+=num;
        }
        long ans=high;
        while(low<=high){
            long mid=(low+high)/2;
            if(splitnumss(nums,k,mid)){
                ans=mid;
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
       return (int)ans;

    }
            
    public boolean splitnumss(int[]nums,int k,long maxi){
        int s=1;
        long a=0;
        for(int num:nums){
      
        if(a+num<=maxi){
            a+=num;

        }else{
            s++;
            a=num;
        }
    } return s<=k;
    }
}