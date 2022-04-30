package gn.k48.leetcode.Year2020;

public class Day20200401_leetcode60 {

    public static String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for(int i=1;i<=n;i++)nums[i-1]=i;
        StringBuilder sb = new StringBuilder();
        k--;
        for(int i=0,size=n;i<n;i++,size--){
            int g = (getfactory(size-1));
            sb.append(nums[k/g]);
            //delete nums[k/g]
            for(int j=k/g;j<size-1;j++)
                nums[j]=nums[j+1];
            k%=g;
        }
        return sb.toString();
    }

    public static int  getfactory(int k){
        int res = 1;
        for(int i=1;i<=k;i++)res*=i;
        return res;
    }


    public static void main(String[] args) {
        System.out.println(getPermutation(4,9));
    }
}
