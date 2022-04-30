package gn.k48.books.PointOffer;

public class Solution3 {
    public static boolean searchArray(int[][] array, int target) {
        if(array.length==0) return false;
        int n = array.length;
        int m = array[0].length;
        int i=0,j=m-1;
        while(j!=-1&&i!=n){
            if(array[i][j]==target)return true;
            else if (array[i][j]>target)j--;
            else if (array[i][j]<target)i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array={{1,2,8,9}, {2,4,9,12}, {4,7,10,13}, {6,8,11,15}};
        int [][] array2= {};
        System.out.println(searchArray(array2,4));
        System.out.println(searchArray(array,5));
    }
}
