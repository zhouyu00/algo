package hot100;

import base.ArrayUtil;

import java.util.ArrayList;
import java.util.List;

public class L139_wordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] res = new boolean[s.length() + 1];
        res[0] = true;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                System.out.println(s.substring(i, j + 1));
                res[j + 1] |= (wordDict.contains(s.substring(i, j + 1)) && res[i]);
            }
        }
        ArrayUtil.printArray(res);
        return res[s.length()];
    }

    public static void main(String[] args) {
        String s = "leetcode";
//        String[] wordDict = {"leet","code"};
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        System.out.println(wordBreak(s, wordDict));

        String s1 = "aaaaaaa";
        List<String> wordDict1 = new ArrayList<>();
        wordDict1.add("aaaa");
        wordDict1.add("aaa");
        System.out.println(wordBreak(s1, wordDict1));

    }
}
