package leetcodeEveryDay.Year2020;

public class Day20200408_leetcode1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int x,y;
        int res = 0;
        for(int i=0;i<points.length-1;i++){
            x= Math.abs(points[i+1][0]-points[i][0]);
            y=Math.abs(points[i+1][1]-points[i][1]);
            res+=Math.max(x,y);
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
