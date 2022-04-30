package gn.k48.leetcode.Year2020;

import java.util.LinkedList;

public class Day20200408_leetcodem13 {
    static int[][] d ={{0,1},{1,0},{0,-1},{-1,0}};
    static boolean[][] flag;
    static int movingCount(int m, int n, int k) {
        LinkedList<Integer[]> q = new LinkedList<>();
        flag= new boolean[m][n];
        int res = 0;
        q.offerLast(new Integer[]{0,0});
        while(!q.isEmpty()){
            Integer[] c = q.poll();
            if(!flag[c[0]][c[1]]){
                flag[c[0]][c[1]]=true;
                res +=1;
                for(int t = 0;t<4;t++){
                    int dx = d[t][0]+c[0];
                    int dy = d[t][1]+c[1];
                    if(dx>=0&&dx<m&&dy>=0&&dy<n&&isAccess(dx,dy,k)&&!flag[dx][dy])
                        q.offerLast(new Integer[]{dx,dy});
                }
            }
        }
        return res;
    }

    public static boolean isAccess(int x,int y,int k){
        int res = (x%10)+(x/10)%10+(x/100)+(y%10)+(y/10)%10+(y/100);
        return res<=k;
    }

    public static void main(String[] args) {
        System.out.println(movingCount(16,8,4));
    }
}
