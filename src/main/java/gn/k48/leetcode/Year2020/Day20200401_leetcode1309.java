package gn.k48.leetcode.Year2020;


import java.util.Stack;

public class Day20200401_leetcode1309 {
    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        char[] cs = s.toCharArray();
        Stack<Integer> stack= new Stack<>();

        for(int i=cs.length-1;i>=0;i--){
            int res = 0;
            int c = cs[i];
            if(c=='#'){
                res=(cs[i-2]-'0')*10+(cs[i-1]-'0');
                i-=2;
            }
            else{
                res=cs[i]-'0';
            }
            stack.push(res);
        }
        while(!stack.isEmpty()){
            sb.append((char)(stack.pop()+'a'-1));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(freqAlphabets("1326#"));
    }
}
