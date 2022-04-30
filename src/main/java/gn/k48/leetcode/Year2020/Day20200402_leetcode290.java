package gn.k48.leetcode.Year2020;

import java.util.HashMap;
import java.util.HashSet;

public class Day20200402_leetcode290 {
    public static boolean wordPattern(String pattern, String str) {
        char[] ps = pattern.toCharArray();
        String[] ss = str.split(" ");
        if(ss.length!=ps.length)return false;
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        HashMap<String,Character> rmap = new HashMap<>();
        for(int i=0;i<ss.length;i++){
            if(rmap.containsKey(ss[i])){
                sb.append(rmap.get(ss[i]));
            }
            else{
                if(set.contains(ps[i]))return false;
                rmap.put(ss[i],ps[i]);
                sb.append(ps[i]);
            }
            set.add(ps[i]);
        }
        System.out.println(sb.toString());
        return pattern.equals(sb.toString());
    }
    public static void main(String[] args) {
        String pattern ="aaa";
        String str = "aa aa aa aa";
        System.out.println(wordPattern(pattern,str));
    }
}
