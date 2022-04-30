package gn.k48.books.codeInterviewPointer.chapter1;

public class Sort {
    public static int[] getRandomArray(){
        int[] nums= new int[10+(int)(Math.random()*10)];
        for(int i=1;i<nums.length;i++){
            nums[i]=(int)((Math.random())*200)-100;
        }
        return nums;
    }
    public static int[] copyArray(int[] nums){
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=nums[i];
        }
        return res;
    }
    public static void swap(int[] nums,int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    //对数器
    public static boolean Comparator(int[] nums1,int[] nums2){
        boolean res = true;
        for(int i=0;i< nums1.length;i++){
            if(nums1[i]!=nums2[i])res=false;
        }
        if(res) System.out.println("yes");
        else System.out.println("no");
        return res;
    }

    //排序算法
    //冒泡排序
    public static void BlobSort(int[] nums){
        for(int i=nums.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(nums[j]>nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }
    }
    //选择排序
    public static void selectSort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<nums.length;j++) {
                minIndex=(nums[j]<nums[minIndex])?j:minIndex;
            }
            swap(nums,i,minIndex);
        }
    }
    //插入排序
    public static void insertSort(int[] nums){
        for(int i=1;i<nums.length;i++){
            for(int j=i-1;j>=0&&nums[j]>nums[j+1];j--){
                swap(nums,j,j+1);
            }
        }
    }
    //归并排序
    public static void mergeSort(int[] nums,int L,int R){
        if(L==R)
            return;
        int M=(L+R)/2;
        mergeSort(nums,L,M);
        mergeSort(nums,M+1,R);
        merge(nums,L,M,R);
    }
    public static void merge(int[] nums,int L,int M,int R){
        int[] help=new int[R-L+1];
        int i=L,j=M+1,k=0;
        while(i<=M&&j<=R){
            help[k++]=nums[i]<nums[j]?nums[i++]:nums[j++];
        }
        while(i<=M) help[k++]=nums[i++];
        while(j<=R) help[k++]=nums[j++];
        for(int e=0;e<help.length;e++){
            nums[L+e]=help[e];
        }
    }
    //快速排序
    public static void quickSort(int[] nums,int L,int R){
        if(L<R){
            int[] p=partition(nums,L,R);
            quickSort(nums,L,p[0]-1);
            quickSort(nums,p[1]+1,R);
        }
    }
    public static int[] partition(int[] nums,int L,int R){
        int pick =L+(int)((R-L+1)*Math.random());
        swap(nums,pick,R);
        int less=L,more=R;
        while(L<more){
            if(nums[L]<nums[R]){
                swap(nums,less++,L++);
            }
            else if(nums[L]>nums[R]){
                swap(nums,--more,L);
            }
            else{
                L++;
            }
        }
        swap(nums,more,R);
        return new int[] {less,more};
    }
    //堆排序
    public static void heapSort(int[] nums){
        for(int i=0;i<nums.length;i++){
            heapInsert(nums,i);
        }
        int heapEnd=nums.length-1;
        swap(nums,0,heapEnd);
        while(heapEnd>0){
            heapify(nums,0,--heapEnd);
            swap(nums,0,heapEnd);
        }
    }
    public static void heapInsert(int[] nums,int index){
        while(nums[index]>nums[index/2]){
            swap(nums,index,index/2);
            index=index/2;
        }
    }
    public static void heapify(int[] nums,int index,int end){
        int left= 2*index+1;
        while(left<end){
            int bigger=left+1<end&&nums[left]>nums[left+1]?left:left+1;
            bigger=nums[index]>nums[bigger]?index:bigger;
            if(index==bigger){
                break;
            }
            swap(nums,index,bigger);
            index=bigger;
            left=2*index+1;
        }
    }

    public static void main(String[] args) {
        int[] nums1= getRandomArray();
        int[] nums2= copyArray(nums1);
        int[] nums3= copyArray(nums1);
        int[] nums4= copyArray(nums1);
        int[] nums5= copyArray(nums1);
        int[] nums6= copyArray(nums1);
        printArray(nums1);
        BlobSort(nums1);
        printArray(nums1);
        selectSort(nums2);
        printArray(nums2);
        insertSort(nums3);
        printArray(nums3);
        mergeSort(nums4,0,nums4.length-1);
        printArray(nums4);
        quickSort(nums5,0,nums5.length-1);
        printArray(nums5);
        heapSort(nums6);
        printArray(nums6);

        System.out.println(Comparator(nums1,nums2)&&Comparator(nums5,nums6));
    }
}
