#include <iostream>
#include <vector>

using namespace std;

void printVec(vector<int> &arr){
    for(int i=0;i<arr.size();i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}


void swap(vector<int> &arr,int i ,int j){
    int t = arr[i];
    arr[i]=arr[j];
    arr[j]=t;
}

void simple_sort(vector<int> &arr){
    for(int i=0;i<arr.size();i++){
        int min_idx = i;
        for(int j=i;j<arr.size();j++){
            if(arr[j]<arr[min_idx])min_idx = j;
        }
        if(min_idx!=i)swap(arr,i,min_idx);
        printVec(arr);
    }
}

//从上往下
void heap_adjust(vector<int> &arr,int start,int end){
    if (start ==end )return;
    //左子树
    for(int i =start,j = 2*(i+1)-1;j<=end;i=j,j=2*(i+1)-1){
        if(j+1<end&&arr[j]<arr[j+1])j++;
        if(arr[i]<arr[j])swap(arr,i,j);
    }
}

//从下往上
void build_heap(vector<int> &arr){
    if(arr.size()==0)return;
    for(int i =arr.size()/2;i>=0;i--){
        heap_adjust(arr,i,arr.size()-1);
    }
}

//堆排序
void heap_sort(vector<int> &arr){
    //建堆
    build_heap(arr);
    for(int i=arr.size()-1;i>=0;){
        swap(arr,0,i--);
        heap_adjust(arr,0,i);
        printVec(arr);
    }
}



int main(){
    vector<int> arr = {98,2,324,5,123,83,33,67,23};
    printVec(arr);
    // simple_sort(arr);
    heap_sort(arr);
    printVec(arr);
    return 0;
}