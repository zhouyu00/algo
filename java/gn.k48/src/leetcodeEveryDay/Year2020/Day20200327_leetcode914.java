package leetcodeEveryDay.Year2020;

import java.util.ArrayList;
import java.util.HashMap;

public class Day20200327_leetcode914 {
    public static boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> countMap = new HashMap<>();
        int maxValue = Integer.MIN_VALUE;
        for(int i=0;i<deck.length;i++){
            maxValue=Math.max(maxValue,deck[i]);
            if(!countMap.containsKey(deck[i])){
                countMap.put(deck[i],1);
            }
            else countMap.put(deck[i],countMap.get(deck[i])+1);
            if(countMap.get(deck[i])>maxValue)maxValue=countMap.get(deck[i]);
        }
        ArrayList<Integer> counts = new ArrayList<>(countMap.values());
        if(maxValue<2) return false;
        for(int x = 2;x<=maxValue;x++){
            boolean res = true;
            for(int i=0;i<counts.size();i++){
                int t = counts.get(i);
                if(t%x!=0)res = false;
            }
            if(res == true) return true;
        }
        return false;
    }
    //其实可以看作一道求最大公约数的题目
    public static void main(String[] args) {
        int[] inputs = {1,1,2,3,4,4,3,2,1};
        System.out.println(hasGroupsSizeX(inputs));
    }
}
