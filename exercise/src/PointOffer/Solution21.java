package PointOffer;

public class Solution21 {
    /*
    partition 算法：快排的用法
     */
    public static void swap(int[] array,int x,int y){
        int t = array[x];
        array[x]=array[y];
        array[y]=t;
    }
    public static void reOrderArray(int[] array) {
        int L=0;
        int R=array.length-1;
        int odd=0;
        int even=R;
        while(L<even){
            if(array[L]%2==1){
                swap(array,odd++,L++);
            }
            else{
                swap(array,even--,L);
            }
        }
    }
    public static void  printArray(int[] array){
        for(int x:array){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        printArray(arr);
        reOrderArray(arr);
        printArray(arr);
    }
}
