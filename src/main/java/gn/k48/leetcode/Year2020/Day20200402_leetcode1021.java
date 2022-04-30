package gn.k48.leetcode.Year2020;

public class Day20200402_leetcode1021 {
    public static String removeOuterParentheses(String S) {
        int s =  0;
        char[] cs = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count =0;
        for(int i=0;i<cs.length;i++){
            char c = cs[i];
            if(c==')') count--;
            if(count>0)sb.append(c);
            if(c=='(') count++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
    }
}
