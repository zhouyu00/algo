package gn.k48.leetcode.Year2020;

public class Day20200330_leetcodem62 {
    public static int lastRemaing(int n ,int m){
        int p = 0;
        for(int i=2;i<=n;i++){
            p=(p+m)%i;
        }
        return p;
    }

    public static void main(String[] args) {
        System.out.println(lastRemaing(5,3));
    }
}
