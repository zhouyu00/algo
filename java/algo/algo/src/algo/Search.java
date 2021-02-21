
public class Search {
    //二分查找
    public static int biSearch(Integer arr[],int x){
        int l=0,r=arr.length-1;
        while(l<r){
            int m =(l+r)/2;
            if(arr[m]<x)l=m+1;
            else r=m;
        }
        return l;
    }

    public static void main(String[] args){
        Integer[] arr = {2,5,23,33,67,83,98,123,324};
        int res = biSearch(arr, 99);
        System.out.println(res);
    }
}
