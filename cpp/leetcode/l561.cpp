#include<bits/stdc++.h>

using namespace std;

int arrayPairSum(vector<int>& nums){
    //升序
    sort(nums.begin(),nums.end(),less<int>());
    int res =0 ;
    for(int i=0;i<nums.size();i+=2){
        res += nums[i];
    }
    return res;
}



int main(){
    
    return 0;
}