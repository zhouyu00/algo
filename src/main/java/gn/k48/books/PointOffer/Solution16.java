package gn.k48.books.PointOffer;

public class Solution16 {
    public static double Power(double base, int exponent) {
        double res =1;
        if(exponent==0){
            return 1.0;
        }
        else if(exponent>0){
            while(exponent!=0){
                res*=base;
                exponent--;
            }
        }
        else{
            while(exponent!=0){
                res/=base;
                exponent++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Power(4.0,-2));
    }
}
