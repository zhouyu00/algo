package gn.k48.books.PointOffer;
public class Solution11 {
    public static int findMin(int[] nums) {
        int N = nums.length-1;
        while(nums[N]==nums[0])N--;
        int left=0,right=N;
        while(left<right){
            int mid=(left+right)>>1;
            if(nums[mid]<nums[0]){
                right=mid;
            }
            else left=mid+1;
        }
        return nums[right];
    }

    public static void main(String[] args) {
        int[] p={0, 1, 3, 5, 5, 5, 7, 8, 9, 9, 9, 9, 10, 11, 12, 14, 15, 16, 18, 18, 18, 22, 23, 23, 24, 25, 26, 27, 27, 27, 30, 31, 32, 33, 34, 34, 35, 36, 36, 37, 39, 39, 44, 45, 46, 46, 47, 48, 49, 49, 49, 54, 55, 56, 58, 58, 58, 59, 59, 60};
        System.out.println(findMin(p));
    }
}
