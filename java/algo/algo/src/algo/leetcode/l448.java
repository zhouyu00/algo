package algo.leetcode;

import java.util.ArrayList;
import java.util.List;
import algo.ArrayUtil;

public class l448 {
    public static  List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length+1;
        for(int i =0;i<nums.length;i++){
            int x = nums[i]%n-1;
            nums[x]+=n;
        }
        // ArrayUtil.printIntArray(nums);
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=n)res.add(i+1);
        }
        // ArrayUtil.printList(res);
        return res;
    }

    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> res = findDisappearedNumbers(nums);

        for(Integer e:res){
            System.out.println(e);
        }
    }
}
