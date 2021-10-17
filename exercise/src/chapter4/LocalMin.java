package chapter4;

public class LocalMin {
    public static int getIndex(int[] arr){
        if(arr.length==0)return -1;
        if(arr.length==1||arr[0]<arr[1])return 0;
        int N = arr.length;
        if(arr[N-1]<arr[N-2])return N-1;
        int left = 1;
        int right= N-2;
        int mid;
        while(left<right){
            mid=(left+right)/2;
            if(arr[mid-1]>arr[mid]){
                right= mid-1;
            }else if(arr[mid]>arr[mid+1]){
                left= mid+1;
            }else{
                return mid;
            }
        }
        return left;

    }

    public static void printArray(int[] arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 6, 5, 3, 4, 6, 7, 8 };
        printArray(arr);
        int index = getIndex(arr);
        System.out.println("index: " + index + ", value: " + arr[index]);

    }
}
