package leetcodeEveryDay.hot100;
public class L85_maximalRectangle{
    public static void maximalRectangle(char[][] matrix){
        
        for(int y=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                for(int ly=0;i)
            }
        }
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