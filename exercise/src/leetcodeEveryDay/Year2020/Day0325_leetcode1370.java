package leetcodeEveryDay.Year2020;


import java.util.ArrayList;

public class Day0325_leetcode1370 {
    public static String sortString(String s) {
        int[] alpha = new int[26];
        char[] cs = s.toCharArray();
        int count = 0;
        for(int i=0;i<cs.length;i++){
            alpha[cs[i]-'a']+=1;
            count +=1;
        }
        ArrayList<StringBuilder> strList = new ArrayList<>();
        while(count!=0){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<26;i++){
                if(alpha[i]>0){
                    sb.append((char)('a'+i));
                    alpha[i]--;
                    count--;
                }
            }
            strList.add(sb);
        }
        StringBuilder res = new StringBuilder();
        boolean reverse = false;
        for(int i=0;i<strList.size();i++){
            res.append(reverse?strList.get(i).reverse():strList.get(i));
            reverse=!reverse;
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s="aaaabbbbcccc";
        String s1="leetcode";
        System.out.println(sortString(s));
    }
}
