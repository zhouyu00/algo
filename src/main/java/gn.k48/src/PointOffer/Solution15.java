package PointOffer;

public class Solution15 {
    public static int NumberOf1(int n)
    {
        int res=0;
        while(n!=0){
            res+=(n&1);
            n=n>>>1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1(-2));
    }
}
