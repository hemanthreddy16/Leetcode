class Solution {
    public int maxProfit(int[] prices) {
        int b1=Integer.MAX_VALUE;
        int p1=0;
        int b2=Integer.MAX_VALUE;
        int p2=0;
       for(int price:prices){
            b1=Math.min(b1,price);
            p1=Math.max(p1,price-b1);
             b2=Math.min(b2,price-p1);
            p2=Math.max(p2,price-b2);

        }return p2;

        
    }
}