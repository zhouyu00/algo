package gn.k48.leetcode.Year2020;

public class Day20200401_leetcodem15 {
    public static int hammingWeight(int n) {
        int res = 0;
        while(n!=0){
            n=n&(n-1);
            res+=1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(7));
    }
}
