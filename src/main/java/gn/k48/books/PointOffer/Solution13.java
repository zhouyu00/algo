package gn.k48.books.PointOffer;
import java.util.*;

public class Solution13 {
    public static class Pair{
        int x;
        int y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public static int sum(int num){
        int res=0;
        while(num!=0){
            res+=num%10;
            num/=10;
        }
        return res;
    }

    public static int movingCount(int threshold, int rows, int cols)
    {
        if(rows==0||cols==0)return 0;
        boolean[][] wasIn = new boolean[rows][cols];
        int[][] d ={{0,1},{1,0}};
        Queue<Pair> q= new LinkedList<>();
        q.add(new Pair(0,0));
        int res=0;
        wasIn[0][0]=true;
        while(!q.isEmpty()){
            Pair pair = q.poll();
            res+=1;
            for(int i=0;i<2;i++){
                int tx = pair.x+ d[i][0];
                int ty = pair.y+ d[i][1];
                if(tx>=0&&tx<rows&&ty>=0&&ty<cols&&!wasIn[tx][ty]&&sum(tx)+sum(ty)<=threshold){
                    q.add(new Pair(tx,ty));
                    wasIn[tx][ty]=true;
                }

            }

        }
        return res;
    }

    public static void main(String[] args) {
        int k=18,m=40,n=40;
        System.out.println(movingCount(7,4,5));
    }
}
