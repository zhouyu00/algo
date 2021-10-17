//package hot100;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class L3_lengthOfLongestSubstring {
//
//    public static int lengthOfLongestSubstring(String s) {
//        Map<Character, Integer> map = new HashMap<>();
//        char[] chs = s.toCharArray();
//        for (int i = 0; i < chs.length; i++) {
//            for (int j = i; j < chs.length; j++) {
//                if (map.containsKey(chs[j])) {
//                    int t = map.get(chs[j]);
//                    if (t >= i) {
//                        i = t;
//                    }
//                }
//                map.put(chs[j], j);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
