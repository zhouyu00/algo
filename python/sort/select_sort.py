# 选择排序
class Solution(object):
    @staticmethod
    def swap(arr,i,j):
            t = arr[i]
            arr[i] = arr[j]
            arr[j] = t

    def simple_sort(self,arr):
        l =len(arr)
        for i in range(l-1):
            # 选择i+1到最小的放置到i上
            idx = i
            for j in range(i,l):
                if arr[j]<arr[idx]: idx = j
            if idx != i:
                Solution.swap(arr,i,idx)

    def heap_sort(self,arr):
        """
        start 下标从0开始
        fix 方法维护一个最大堆
        """
        #向下调整
        def heap_adjust(arr,start,end):
            k = start
            j = 2*(start+1) -1 # 左子树索引
            while k<l:
                if j+1<=end and arr[j+1]>arr[j]:j+=1
                if j<=end and arr[k]<arr[j]:Solution.swap(arr,k,j)
                k,j= j,2*(k+1)-1
        #向上调整
        def build_heap(arr,start,end):
            for e in range(end//2,0,-1):
                heap_adjust(arr,0,e)

        #堆排序
        l = len(arr)
        build_heap(arr,0,l-1)
        for i in range(l-1,0,-1):
            Solution.swap(arr,0,i)
            i-=1
            heap_adjust(arr,0,i)
        

if __name__=='__main__':
    arr =[98,2,324,5,123,83,33,67,23]
    print(arr)
    s = Solution()
    # s.simple_sort(arr)
    s.heap_sort(arr)
    print(arr)
