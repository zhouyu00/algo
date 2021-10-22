package leetcodeEveryDay.hot100;
public class L85_maximalRectangle{
    public static void maximalRectangle(char[][] matrix){
        int res = Integer.MIN_VALUE;
        for(int y=0;y<matrix.length;y++){
            for(int x=0;x<matrix[0].length;x++){
                for(int ly=1;y+ly<matrix.length;ly++){
                    for(int lx=1;x+lx<matrix[0].length;lx++){
                        if(pollute(matrix, y, x, ly, lx)){
                            res = Math.max(res, ly*lx);
                        }
                    }
                }
            }
        }
        return res;
    }

    public static boolean pollute(char[][] matrix,int y,int x,int ly,int lx){
        for(int i=y;i<y+ly;i++){
            for(int j=x;j<x+lx;j++){
                if(matrix[i][j]!='1'){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
       char[][] matrix = {
                    {'1','0','1','0','0'},
                    {'1','0','1','1','1'},
                    {'1','1','1','1','1'},
                    {'1','0','0','1','0'}}; 
    }
}