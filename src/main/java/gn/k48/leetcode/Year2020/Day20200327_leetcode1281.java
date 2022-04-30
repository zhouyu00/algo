package gn.k48.leetcode.Year2020;

public class Day20200327_leetcode1281 {
    public static int subtractProductAndSum(int n) {
        int multi = 1;
        int sum = 0;
        while(n!=0){
            int t = n%10;
            n= n/10;
            multi*=t;
            sum+=t;
        }
        return multi-sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }
}
