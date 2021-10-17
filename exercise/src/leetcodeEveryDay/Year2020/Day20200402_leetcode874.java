package leetcodeEveryDay.Year2020;

import javax.swing.border.SoftBevelBorder;

public class Day20200402_leetcode874 {
    public static int robotSim(int[] commands, int[][] obstacles) {
        int x=0,y=0,res = 0;
        //顺时针方向
        int[][] d = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        int sd = 0;
        for(int i =0;i<commands.length;i++){
            int command = commands[i];
            if(command==-2)sd=(sd-1+d.length)%d.length;
            else if(command==-1)sd=(sd+1)%d.length;
            else{
                int dx = d[sd][0],dy = d[sd][1];
                int ob =getObstacle(obstacles,x,y,sd,command,d);
                if(ob==-1){
                    x+=dx*command;
                    y+=dy*command;
                }
                else{
                    x=obstacles[ob][0]-dx;
                    y=obstacles[ob][1]-dy;
                }
                int dis = (int)(Math.pow(x,2)+Math.pow(y,2));
                res=Math.max(res,dis);
            }
        }
        return res;
    }

    public static int getObstacle(int[][] obstacles,int x, int y,int ds,int l,int[][] d){
        for(int i =0;i<obstacles.length;i++){
            int dx = obstacles[i][0]-x;
            int dy = obstacles[i][1]-y;
            int tx = l*d[ds][0];
            int ty = l*d[ds][1];
            if((dy==ty&&tx>dx)||(dx==tx&&ty>dy))return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] commands = new int[]{4,-1,4,-2,4};
        int[][] ob = new int[][]{{2,4}};
        System.out.println(robotSim(commands,ob));
    }
}
