package gn.k48.books.PointOffer;

public class Solution2 {
    public static int duplicateInArray(int[] nums) {
        int left =1,right=nums.length-1;
        while(left<right){
            int mid=(left+right)>>1;
            int s=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<=mid&&nums[i]>=left)s+=1;
            }
            if(s>mid-left+1)right=mid;
            else left=mid+1;
        }

        return right;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 5, 9, 7, 9, 5, 1, 5, 6, 7};
        System.out.println(duplicateInArray(nums));
    }
}
