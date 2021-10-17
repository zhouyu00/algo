package leetcodeEveryDay.Year2020;

public class Day20200325_leetcode892 {
    public static int surfaceArea(int[][] grid) {
        /*
        1.统计个数c，每个方块4个面（不计算上下）
        10*4=40
        2.计算相邻最小面，
        (-1-1)+(-1-2)+(-1-3)+(-3-2)=-2-3-4-5=-14
        3.统计有的格数
        4*2=8
        4.合计
        40-14+8=34
         */
        int cubeCount = 0;
        int gridCount = 0;
        int minusCount = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                cubeCount+=grid[i][j];
                gridCount+=(grid[i][j]>0?1:0);
                if(i!=0)minusCount+=Math.min(grid[i-1][j],grid[i][j]);
                if(i!=grid.length-1)minusCount+=Math.min(grid[i+1][j],grid[i][j]);
                if(j!=0)minusCount+=Math.min(grid[i][j-1],grid[i][j]);
                if(j!=grid.length-1)minusCount+=Math.min(grid[i][j+1],grid[i][j]);
            }
        }
        return cubeCount*4-minusCount+gridCount*2;
    }
    public static void main(String[] args) {
            int[][] grid =new int[][]{{1,0},{0,2}};
            int[][] grid1 = new int[][]{{2,2,2},{2,1,2},{2,2,2}};
           System.out.println(surfaceArea(grid1));
    }
}
