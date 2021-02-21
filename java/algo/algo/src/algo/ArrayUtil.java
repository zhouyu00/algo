package algo;

public class ArrayUtil {

    public static <T> void swap(T[] arr,int i ,int j){
        if(i>=arr.length||j>=arr.length)return;
        T t = arr[i];
        arr[i]= arr[j];
        arr[j] =t;
    }

    public static void printIntArray(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

    public static <T> void printArray(T[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

    public static <T> void printList(List<T> list){
        for(T e:list){
            System.out.print(e+",");
        }
        System.out.println();
    }

    public static <T> void printLinkList(ListNode head){
        while(head!=null){
            System.out.println(head.val);
            head =head.next;
        }
        System.out.println();
    }
}
