package gn.k48.books.PointOffer;

public class Solution12 {
    static int[][] direction ={{0,1},{0,-1},{1,0},{-1,0}};
    static int n;
    static int m;
    static int N;
    static char[] chs;
    public static boolean hasPath(char[][] matrix, String str) {
        if(matrix.length==0)return false;
        n = matrix.length;
        m = matrix[0].length;
        N= str.length();
        chs=str.toCharArray();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(trace(matrix,0,i,j)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean trace(char[][] matrix,int l,int i,int j){
        if(matrix[i][j]!=chs[l])return false;
        if(l==N-1) return true;
        char t = matrix[i][j];
        matrix[i][j]='*';
        for(int d=0;d<4;d++){
            int x = i+direction[d][0];
            int y = j+direction[d][1];
            if(x>=0&&x<n&&y>=0&&y<m){
                if(trace(matrix,l+1,x,y))return true;
            }
        }
        matrix[i][j]=t;
        return false;
    }

    public static void main(String[] args) {
        char [][] matrix={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(hasPath(matrix,"BCCE"));
    }
}
