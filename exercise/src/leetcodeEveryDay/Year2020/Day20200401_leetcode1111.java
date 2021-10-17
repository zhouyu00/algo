package leetcodeEveryDay.Year2020;

public class Day20200401_leetcode1111 {
    public static int[] maxDepthAfterSplit(String seq) {
        char[] cs = seq.toCharArray();
        int[] res = new int[cs.length];
        int count = 0;
        for(int i=0;i<cs.length;i++){
            if(cs[i]=='('){
                res[i]=count;
                count++;
            }
            else {
                count--;
                res[i]=count;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String seq = "()(())()";
        int[] res = maxDepthAfterSplit(seq);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+",");
        }
    }
}
