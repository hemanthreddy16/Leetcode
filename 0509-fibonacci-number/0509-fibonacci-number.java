import java.util.*;
class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
       int a=fib(n-1);
       int b=fib(n-2);
        return a+b;
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution obj=new Solution();
        System.out.print(obj.fib(n));
    }
}