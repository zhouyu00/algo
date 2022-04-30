package gn.k48.leetcode.Year2020;

public class Day0323_leetcode1385 {
    public static int findTheDistanceValue(int[] arr1,int[] arr2,int d){
        int res =0;
        for(int i=0;i<arr1.length;i++){
            boolean isOk = true;
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    isOk=false;
                    break;
                }
            }
            if(isOk)res+=1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{4,5,8};
        int[] arr2 = new int[]{10,9,1,8};
        System.out.println(findTheDistanceValue(arr1,arr2,2));
    }
}
