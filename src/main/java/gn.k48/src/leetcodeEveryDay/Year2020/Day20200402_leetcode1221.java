package leetcodeEveryDay.Year2020;

public class Day20200402_leetcode1221 {
    public static int balancedStringSplit(String s) {
        int res = 0;
        int count = 0;
        for(char c:s.toCharArray()){
            if(c=='R')count++;
            else count--;
            if(count==0)res++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLLLLRRRLR"));
    }
}
