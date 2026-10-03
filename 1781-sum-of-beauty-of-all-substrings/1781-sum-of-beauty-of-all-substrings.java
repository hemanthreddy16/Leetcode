class Solution {
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int[] a=new int[26];
            for(int j=i;j<s.length();j++){
                a[s.charAt(j)-'a']++;

            
            int max=0;
            int min=Integer.MAX_VALUE;
            for(int k=0;k<26;k++){
                if(a[k]>0){
                    max=Math.max(max,a[k]);
                    min=Math.min(min,a[k]);
                }
            }
            sum+=max-min;  
            }
        }return sum;
        
    }
}