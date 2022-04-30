package gn.k48.leetcode.Year2020;

public class Day20200326_m58 {
    public static String reverseLeftWords(String s, int n) {
        char[] cs = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=n;i<cs.length;i++){
            sb.append(cs[i]);
        }
        for(int i=0;i<n;i++){
            sb.append(cs[i]);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(reverseLeftWords(s,2));
    }
}
