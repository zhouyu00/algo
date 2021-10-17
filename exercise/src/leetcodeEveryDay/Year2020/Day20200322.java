package leetcodeEveryDay.Year2020;

import java.util.HashMap;
import java.util.Map;

public class Day20200322 {
    public static int countCharacters(String[] words, String chars) {
        int res = 0;
        for(int i=0;i<words.length;i++){
            //String word = words[i];
            char[] word = words[i].toCharArray();
            char[] ct = chars.toCharArray();
            HashMap<Character,Integer> record= new HashMap<>();
            for(int k=0;k<ct.length;k++){
                char c = ct[k];
                if(!record.containsKey(c)){
                    record.put(c,1);
                }
                else{
                    record.put(c,record.get(c)+1);
                }
            }
            for(int j=0;j<word.length;j++){
                char c = word[j];
                if(!record.containsKey(c)||record.get(c)==0)break;
                else{
                    record.put(c,record.get(c)-1);
                }
                if(j==word.length-1) res+=words[i].length();
            }
        }
        return res;
    }

    //将字母表和单词都进行哈希计数
    public static int countCharacters1(String[] words, String chars) {
        int res = 0;
        //处理字母表
        char[] ct = chars.toCharArray();
        HashMap<Character,Integer> ctable= new HashMap<>();
        for(int k=0;k<ct.length;k++){
            char c = ct[k];
            if(!ctable.containsKey(c)){
                ctable.put(c,1);
            }
            else{
                ctable.put(c,ctable.get(c)+1);
            }
        }
        //处理单词
        for(int i=0;i<words.length;i++){
            boolean canDeal = true;
            String word = words[i];
            char[] wc = word.toCharArray();
            HashMap<Character,Integer> wordMap = new HashMap<>();
            for(int j=0;j<wc.length;j++){
                char c = wc[j];
                if(!wordMap.containsKey(c)){
                    wordMap.put(c,1);
                }
                else wordMap.put(c,wordMap.get(c)+1);
            }
            for(char key:wordMap.keySet()){
                if(!ctable.containsKey(key)||ctable.get(key)<wordMap.get(key))
                {
                    canDeal=false;
                }
            }
            if(canDeal)res+=word.length();
        }
        return res;
    }

    //使用数组，不用判断
    public static int countCharacters2(String[] words, String chars) {
        int res = 0;
        //处理字母表
        char[] ct = chars.toCharArray();
        int[] ctable = new int[26];
        for(int k=0;k<ct.length;k++){
            ctable[ct[k]-'a']+=1;
        }
        //处理单词
        for(int i=0;i<words.length;i++){
            String word = words[i];
            char[] wc = word.toCharArray();
            int[] re = new int[26];
            for(int j=0;j<wc.length;j++)re[wc[j]-'a']+=1;
            for(int j=0;j<26;j++){
                if(ctable[j]<re[j])break;
                if(j==25)res+=word.length();
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String[] words = new String[]{"cat","bt","hat","tree"};
        String chars = "atach";

        System.out.println(countCharacters2(words,chars));
    }
}
