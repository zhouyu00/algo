import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;


public class l30 {
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        
        if(words.length==0)return res;
        int wl = words[0].length();
        if(s.length()<wl)return res;
        //统计单词表中的个数
        Map<String,Integer> wordSet = new HashMap<>();
        for(String word:words){
            wordSet.put(word,wordSet.getOrDefault(word,0)+1);
        }
        
        //注意滑动不是按单词长度而是按字符
        for(int i=0;i<wl;i++){
            int start=i,end=i,cnt =0;
            //统计字符串中出现的个数
            Map<String,Integer> wordMap = new HashMap<>();
            
            //内层按照单词长度开始滑动
            while(end+wl<=s.length()){
                String word = s.substring(end, end+wl);
                end +=wl;
                //不含有该单词
                if(!wordSet.keySet().contains(word)){
                    cnt =0;
                    start = end;
                    wordMap.clear();//中间不能有间隔
                }
                //含有该单词
                else{
                    wordMap.put(word, wordMap.getOrDefault(word,0)+1);
                    cnt++;
                    while(wordMap.get(word)>wordSet.get(word)){
                        String popWord = s.substring(start,start+wl);
                        start += wl;
                        cnt--;
                        wordMap.put(popWord, wordMap.get(popWord)-1);
                    }
                    if(cnt==words.length)res.add(start);
                }
            }

        }
        return res;
    }

    public static void printList(List<Integer> res){
        for(Integer t:res){
            System.out.print(t+",");
        }   
        System.out.println();
    }
    

    public static void main(String[] args){
        String  s ="barfoothefoobarman";
       String[] words ={"foo","bar"};
        List<Integer> res = findSubstring(s, words);
        printList(res);
    }
}
