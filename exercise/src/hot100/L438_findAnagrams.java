package hot100;


import java.util.ArrayList;
import java.util.List;

public class L438_findAnagrams {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int m = s.length();
        int n = p.length();
        char[] schs = s.toCharArray();
        char[] pchs = p.toCharArray();
        //每个字母的计数
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for (int i = 0; i < n; i++) {
            cnt1[pchs[i] - 'a']++;
        }
        for (int start = 0, end = 0; start < m - n + 1; start++) {//开始位置
            for (; end < m && end - start < n; end++) {//结束位置
                cnt2[schs[end] - 'a']++;
            }
            if (compare(cnt1, cnt2)) {
                res.add(start);
            }
            cnt2[schs[start] - 'a']--;
        }
        return res;
    }

    public static boolean compare(int[] cnt1, int[] cnt2) {
        for (int i = 0; i < 26; i++) {
            if (cnt1[i] != cnt2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        String s1 = "abab";
        String p1 = "ab";
        List<Integer> res = findAnagrams(s1, p1);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
}
