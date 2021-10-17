package leetcodeEveryDay.Year2020;

public class Day20200402_leetcode1252 {
    public static int oddCells(int n, int m, int[][] indices) {
        int[][] cells = new int[n][m];
        int res  = 0;
        for(int i=0;i<indices.length;i++){
            int r = indices[i][0];
            int c = indices[i][1];
            for(int j=0;j<m;j++)cells[r][j]+=1;
            for(int j=0;j<n;j++)cells[j][c]+=1;
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++){
                System.out.print(cells[i][j]+",");
                res+=(cells[i][j]%2);
            }
            System.out.println();
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] indices = new int[][]{{0,1},{1,1}};
        System.out.println(oddCells(2,3,indices));
    }
}
