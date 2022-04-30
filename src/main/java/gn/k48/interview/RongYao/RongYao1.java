package gn.k48.interview.RongYao;


import java.util.Scanner;

public class RongYao1 {

    public static void solution(int[] nums){
        for(int i=-5;i<=5;i++){
            int isum = i*nums[0];
            for(int j=-5;j<=5;j++){
                int jsum = isum + j*nums[1];
                for(int k=-5;k<=5;k++){
                    int ksum = jsum + k*nums[2];
                    if(ksum>=2540&&ksum<=2630){
                        System.out.println(ksum+" "+i+" "+j+" "+k);
                    }
                }
            }

        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine().replace("[","").replace("]","");
        String[] strs = s.split(",");
        int[] nums = new int[strs.length];
        for(int i=0;i<nums.length;i++) nums[i] = Integer.parseInt(strs[i]);

//        for(int i=0;i<nums.length;i++) System.out.println(nums[i]);
        solution(nums);
    }
}
