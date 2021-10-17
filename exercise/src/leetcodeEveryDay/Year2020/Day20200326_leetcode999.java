package leetcodeEveryDay.Year2020;

public class Day20200326_leetcode999 {
    public static int numRookCaptures(char[][] board) {
        int res = 0;
        int x ,y;x=y=0;

        for(int i=0;i<board.length;i++) {
            for (int j=0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    x=i;y=j;
                }
            }
        }
        System.out.println(x+","+y);
        //上
        for(int i=0;x-i<8&&x>=i;i++){
            if(board[x-i][y]=='B')break;
            if(board[x-i][y]=='p'){
                res+=1;
                break;
            }
        }
        //下
        for(int i=0;x+i<8&&x+i>=0;i++){
            if(board[x+i][y]=='B')break;
            if(board[x+i][y]=='p'){
                res+=1;
                break;
            }
        }
        //左
        for(int i=0;y-i<8&&y>=i;i++){
            if(board[x][y-i]=='B')break;
            if(board[x][y-i]=='p'){
                res+=1;
                break;
            }
        }
        //右
        for(int i=0;y+i<8&&y+i>=0;i++){
            if(board[x][y+i]=='B')break;
            if(board[x][y+i]=='p'){
                res+=1;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        char[][] input = new char[][]
                {       {'.','.','.','.','.','.','.','.'},
                        {'.','.','.','p','.','.','.','.'},
                        {'.','.','.','p','.','.','.','.'},
                        {'p','p','.','R','.','p','B','.'},
                        {'.','.','.','.','.','.','.','.'},
                        {'.','.','.','B','.','.','.','.'},
                        {'.','.','.','p','.','.','.','.'},
                        {'.','.','.','.','.','.','.','.'}};
        System.out.println(numRookCaptures(input));
    }
}
