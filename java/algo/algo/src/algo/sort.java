import jdk.internal.net.http.common.MinimalFuture;

public class sort{

    //交换排序
    /**
     * 冒泡排序
     * @param arr
     */
    public static void BlubSort(Integer[] arr){

    }

    //选择排序
    /**
     * 选择排序
     * 每次从数组中选择最小的放在数组前列
     * 时间复杂度 O(N^2)
     * @param arr
     */
    public static void selectSort(Integer[] arr){
        for(int i = 0;i<arr.length;i++){
            int minIdx = i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[minIdx])minIdx =j;
            }
            if(minIdx!=i) ArrayUtil.swap(arr, i, minIdx);
            ArrayUtil.printArray(arr);
        }
    }

    /**
     * 堆排序
     * @param arr
     */
    public static void heapSort(Integer[] arr){

    }
    


    public static void main(String[] args){
        Integer[] arr = {98,2,324,5,123,83,33,67,23};
        selectSort(arr);
    }   
}
