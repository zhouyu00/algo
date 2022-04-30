package gn.k48.leetcode.Year2020;

public class Day20200402_leetcode1351 {
    public static int countNegatives(int[][] grid) {
        int res = 0;
        int m = grid.length,n=grid[0].length;
        for(int i=m-1,j=0;i>=0;i--){
            while(j<n&&grid[i][j]>=0)j++;
            res+=(n-j);
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] grid={  {4,3,2,-1},
                        {3,2,1,-1},
                        {1,1,-1,-2},
                        {-1,-1,-2,-3}};

        System.out.println(countNegatives(grid));
    }
}
