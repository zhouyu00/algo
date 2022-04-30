package gn.k48.leetcode.Year2020;

import java.util.Arrays;

public class Day20200328_leetcode820 {
        static int[] cnt = new int[14010];
        static int[][] t = new int[14010][27];
        static int idx = 0;

        public static int insert(String s){
            char[] cs = s.toCharArray();
            int p=0;
            boolean isNew = false;
            for(int i=0;i<cs.length;i++){
                char c = cs[cs.length-1-i];
                int u = c-'a'+1;
                if(t[p][u]==0){
                    t[p][u]=++idx;
                    isNew = true;
                }
                p=t[p][u];
                cnt[p]++;
            }
            return isNew?s.length()+1:0;
        }


    public static int minimumLengthEncoding(String[] words) {
       int len = 0;
       Arrays.sort(words,(s1,s2)->s2.length()-s1.length());

       for(int i=0;i<words.length;i++){
           len += insert(words[i]);
       }
       return len;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"time","ime"};
        System.out.println(minimumLengthEncoding(words));
    }
}
