class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int t=0;
        int b=n-1;
        int l=0;
        int r=matrix[0].length - 1;
        List<Integer> a=new ArrayList<>();
       while(l<=r && t<=b){
        for(int i=l;i<=r;i++){
            a.add(matrix[t][i]);

        }t++;
        
        for(int i=t;i<=b;i++){
            a.add(matrix[i][r]);
        
        }r--;
        if(t<=b){
        for(int i=r;i>=l;i--){
            a.add(matrix[b][i]);
        }}b--;
if(l<=r)
{        for(int i=b;i>=t;i--){
            a.add(matrix[i][l]);
 } }l++;
       }
       return a; 
    }
}