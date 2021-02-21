#include <bits/stdc++.h>

using namespace std;

vector<vector<int>> matrixReshape(vector<vector<int>>& nums, int r, int c) {
    int ly = nums.size();
    if(ly ==0)return nums;
    int lx = nums[0].size();
    if (lx==0) return nums;
    if (lx*ly!=r*c)return nums;
    int y =0,x=0;
    vector<vector<int>> res(r,vector<int>(c));
    for(int i=0;i<ly;i++){
        for(int j=0;j<lx;j++){
            res[y][x]=nums[i][j];
            x=(x+1)%c;
            if(x==0)y++;
        }
    }
    return res;
}

void printVec(vector<vector<int>> & nums){
    for(int i=0;i<nums.size();i++){
        for(int j=0;j<nums[0].size();j++){
            printf("%d,",nums[i][j]);
        }
        printf("\n");
    }
}

int main(){
    int a[2][2] = {{1,2},{3,4}};
    vector<vector<int>> nums(2,vector<int>(2));
    // int ly = sizeof(a)/sizeof(a[0]);
    // int lx = sizeof(a[0])/sizeof(a[0][0]);
    int ly=2,lx =2;
    for(int i=0;i<ly;i++){
        for(int j=0;j<lx;j++){
            nums[i][j]=a[i][j];
        }
    }
    printVec(nums);
    nums = matrixReshape(nums,1,4);
    printVec(nums);
    return 0;
}