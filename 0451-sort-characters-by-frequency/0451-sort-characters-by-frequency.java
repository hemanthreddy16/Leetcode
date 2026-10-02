class Solution {
    public String frequencySort(String s) {

        int[] a=new int[256];
        for(char ch:s.toCharArray()){
            a[ch]++;
        }
        StringBuilder ans=new StringBuilder();
        for(int k=0;k<s.length();k++){
            int max=0;
            char maxi=0;
        for(char ch:s.toCharArray()){
            
            if(a[ch]>max){
                max=a[ch];
                maxi=ch;
            }
        }
            if(max==0){
                break;}
            
        
        for(int i=0;i<max;i++){
            ans.append(maxi);

        }
        a[maxi]=0;
    }return ans.toString();
}
}