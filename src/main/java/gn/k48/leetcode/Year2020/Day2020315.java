package gn.k48.leetcode.Year2020;

import java.util.ArrayList;

public class Day2020315 {
    public static int[][] findContinuousSequence(int target) {
        ArrayList<ArrayList<Integer>> ansList = new ArrayList<>();

        int leftPoint = 1;
        int sum = 1;
        for(int rightPoint=leftPoint+1;rightPoint<target;){
            sum+=rightPoint;
            if(sum==target){
                ArrayList<Integer> ans = new ArrayList<>();
                for(int j=leftPoint;j<=rightPoint;j++){
                    ans.add(j);
                }
                ansList.add(ans);
            }
            if(sum>=target){
                leftPoint+=1;
                sum=leftPoint;
                rightPoint=leftPoint+1;
            }
            else{
                rightPoint++;
            }
        }
        int[][] ansArray = new int[ansList.size()][];
        for(int i=0;i<ansList.size();i++){
            ArrayList<Integer> tArrayList = ansList.get(i);
            int[] ref = new int[tArrayList.size()];
            for(int j=0;j<tArrayList.size();j++){
                ref[j]=tArrayList.get(j);
            }
            ansArray[i]=ref;
        }
        return ansArray;
    }

    public static void main(String[] args) {
        int target = 15;
        int[][] answer = findContinuousSequence(target);
        for(int i=0;i<answer.length;i++){
            System.out.println("[");
            for(int j=0;j<answer[i].length;j++){
                System.out.println(answer[i][j]+",");
            }
            System.out.println("]");
        }
    }
}
