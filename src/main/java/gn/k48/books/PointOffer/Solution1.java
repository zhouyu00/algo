package gn.k48.books.PointOffer;

import java.util.HashSet;

class Solution1 {
    public static int duplicateInArray(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        int N = nums.length-1;
        for(int num:nums)if(num<0||num>N)return -1;
        for(int num:nums){
            if(hashSet.contains(num))
                return num;
            hashSet.add(num);
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr ={52, 35, 51, 77, 19, 10, 27, 37, 54, 26, 75, 9, 71, 81, 76, 75, 21, 100, 54, 50, 87, 40, 21, 87, 18, 23, 58, 12, 17, 84, 11, 6, 91, 73, 57, 19, 85, 65, 36, 44, 40, 77, 33, 56, 27, 48, 77, 59, 8, 65, 77, 13, 9, 52, 53, 9, 77, 73, 85, 33, 31, 10, 84, 94, 4, 13, 82, 12, 91, 89, 93, 40, 42, -100, 85, 36, 20, 33, 13, 48, 38, 93, 30, 87, 47, 44, 29, 47, 33, 52, 36, 55, 20, 29, 68, 58, 64, 5, 15, 26};
        System.out.println(arr.length);
        System.out.println(duplicateInArray(arr));
    }
}
