package gn.k48.books.PointOffer;

public class Solution10 {
    public int Fibonacci(int n) {
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
