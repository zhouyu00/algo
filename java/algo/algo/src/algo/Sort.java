import algo.ArrayUtil;

public class Sort{

    //插入排序
    //直接插入排序
    /**
     * 将每一位插入到已经排好序的序列里
     * @param arr
     */
    public static void insertSort(Integer[] arr){
        //将第一个元素看作已经排好序的序列
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            //从后往前边移动边插入该元素
            int j=i-1;
            for(;j>=0&&temp<arr[j];j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
            ArrayUtil.printArray(arr);
        }
    }
    //折半插入排序
    /**
     * 将寻找插入位置的部分替换成为
     * @param arr
     */
    public static void bInsertSort(Integer[] arr){
       for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int l = 0, r = i,m=i;
            while(l<r){
                m = (l+r)/2;
                if(arr[m]<temp) l= m+1;
                else r =m;
            }
            for(int j=i;j>l;j--){
                arr[j]=arr[j-1];
            }
            arr[l]=temp;
            ArrayUtil.printArray(arr);
       } 
    }
    //希尔排序
    /**
     * 缩小增量排序
     * @param arr
     */
    public static void shellInsert(Integer[] arr){
        //这里的增量按照/2来进行缩小
        for(int dk = arr.length/2;dk>0;dk/=2){
            //进行一趟增量插入排序
            for(int i=dk;i<arr.length;i+=dk){
                int temp = arr[i];
                int j=i-dk;
                for(;j>=0&&temp<arr[j];j-=dk){
                    arr[j+dk]=arr[j];
                }
                arr[j+dk]=temp;
            }
            ArrayUtil.printArray(arr);
        }
    }

    //交换排序
    /**
     * 冒泡排序
     * @param arr
     */
    public static void BlubSort(Integer[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    ArrayUtil.swap(arr,j, j+1);
                }
            }
            ArrayUtil.printArray(arr);
        }
    }


    //快排
    /**
     * 每次交换消除多个逆序，
     * @param arr
     */
    public static void quickSort(Integer[] arr,int l, int r){
        if(l<r){
            int pivot = partition(arr, l, r);
            // System.out.println("pivot="+pivot+",arr[pivot]="+arr[pivot]);
            quickSort(arr, l, pivot-1);
            quickSort(arr, pivot+1, r);
        }
    }

    /**
     * 荷兰旗问题的解决方法
     * 每一趟排序将比pivot小的放到左边，比pivot大的放到右边
     */
    public static int partition(Integer[] arr ,int l,int r){
        int pivot = (l+r)/2;
        //先将pivot放到l
        ArrayUtil.swap(arr, l, pivot);
        int low =l+1,high = r;
        while(low<high){
            //这两个循环和pivot是low还是high有关
            while(low<high&&arr[high]>=arr[l])high--;
            while(low<high&&arr[low]<=arr[l]) low++;
            ArrayUtil.swap(arr, low, high);
        }
        ArrayUtil.swap(arr, l, low);
        ArrayUtil.printArray(arr);
        return low;
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
     * 使用jdk中TimerQueue的写法
     * @param arr
     */
    public static void heapSort(Integer[] arr){
        Integer[] toSort = new Integer[arr.length+1];
        for(int i =0;i<arr.length;i++) toSort[i+1]=arr[i];
        //heapify
        for(int l = arr.length/2;l>0;l/=2) fixDown(toSort, l, arr.length);
        //sort

        for(int i = arr.length+1;i>=1;i--){
            ArrayUtil.swap(toSort, 1, i);
            fixDown(toSort, 1 ,i-2);
            ArrayUtil.printArray(toSort);
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=toSort[i+1];
        }
    }

    public static void fixDown(Integer[] arr,int k,int size){
        int j;
        while((j=k<<1)<=size&&j>0){
            if(j<size&&arr[j]<arr[j+1])j++;
            if(arr[k]>=arr[j])break;
            int temp = arr[j];arr[j]=arr[k];arr[k]=temp;
            k=j;
        }
    }

    public static void fixUp(Integer[] arr,int k){
        while(k>1){
            int j = k>>1;
            if(arr[j]>=arr[k])break;
            int temp = arr[j];arr[j]=arr[k];arr[k]=temp;
            k =j;
        }
    }

    //归并排序
    public static void mergeSort(Integer[] arr){

    }

    //基数排序

    public static void main(String[] args){
        Integer[] arr = {98,2,324,5,123,83,33,67,23};
        ArrayUtil.printArray(arr);
        System.out.println();
        //插入排序
        // insertSort(arr);//直接插入
        // bInsertSort(arr);//折半插入
        // shellInsert(arr);
        //交换排序
        // BlubSort(arr);//冒泡排序
        // quickSort(arr, 0, arr.length-1);//快排
        //选择排序
        // selectSort(arr);//简单选择排序
        heapSort(arr);//堆排序

        ArrayUtil.printArray(arr);
    }   
}
