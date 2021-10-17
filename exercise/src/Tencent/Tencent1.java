package Tencent;

public class Tencent1 {
//    给你一个整数n, 一个数组 长度为n,  数组中元素 范围 0<= x <=n  ，顺序递增，求丢失的一个元素。
//
//    示例：n=4,  arr=[0,1,2,4]  ,结果为 3；
//
//    n=2, arr=[0,1] ,结果为2.
//
//    不要用复杂度O(n)的算法

    public static int getLost(int [] arr ,int n){
        int l = 0, r = n;
        while(l<r){
            int m = (l+r)/2;
            if(arr[m]==m){
                l= m+1;
            }
            else{
                r= m;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        int n1 = 4;
        int[] arr1 = new int[]{0,1,2,4};
        System.out.println(getLost(arr1,n1));

        int n2 = 4;
        int[] arr2 = new int[]{1,2,3,4};
        System.out.println(getLost(arr2,n2));


        int n3 = 4;
        int[] arr3 = new int[]{0,1,2,3};
        System.out.println(getLost(arr3,n3));

        int n4 = 4;
        int[] arr4 = new int[]{0,1,3,4};
        System.out.println(getLost(arr4,n4));
    }
}
