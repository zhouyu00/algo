import java.util.Deque;
import java.util.LinkedList;


public class l32 {
    //dp动态规划解法
    //......((x
    //......()
    //......))
    //......)(x
    public static int longestValidParentheses(String s) {
        if(s.length()<=1)return 0;
        int[] dp = new int[s.length()];
        char[] chars = s.toCharArray();
        dp[1]=chars[0]=='('&&chars[1]==')'?2:0;
        int res = dp[1];
        for(int i=2;i<chars.length;i++){
            if(chars[i]=='(')dp[i]=0;
            else{   //s.charAt(i)=')'
                //能凑成对()
                if(chars[i-1]=='('){
                    dp[i]=dp[i-2]+2;
                }
                //凑不成对))
                else{
                    //往前找不到凑对的
                    if(i-dp[i-1]-1<0||chars[i-dp[i-1]-1]==')'){
                        dp[i]=0;
                    }
                    else{
                        //往前能找到配对的
                        //和当前元素配对的不为字符串的首个元素
                        if(i-dp[i-1]-1>=1){
                            dp[i]=dp[i-1]+dp[i-dp[i-1]-2]+2;
                        }
                        else dp[i] = dp[i-1]+2;
                    }
                }   
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    public static void main(String[] args){
        String s = ")()())";
        String s2= "()(()";
        String s3 ="())";
        String s4 ="()()";
        String s5 =")()())";
        int res = longestValidParentheses(s5);
        System.out.println(res);
    }
}
