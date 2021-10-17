package Huawei;

import java.util.Scanner;

public class Huawei1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.next());
        char[][] m = new char[n][];
        for(int i=0;i<n;i++){
            String line = in.next();
            m[i]=line.toCharArray();
        }
        int res = 0;
        int ly = m.length;
        int lx = m[0].length;
        int ln = Math.min(lx,ly);
        for(int k = ln;k>=1;k--){
            for(int i=0;i<=ly-k;i++){
                for(int j=0;j<=lx-k;j++){
                    if(isOk(m,i,j,k)){
                        res = Math.max(res,k);
                    }
                }
            }
        }
        System.out.println(res*res);
    }

    public static boolean isOk(char[][] m ,int sy,int sx,int k){
        for(int i=sy;i<sy+k;i++){
            for(int j=sx;j<sx+k;j++){
                if(m[i][j]=='0'){
                    return false;
                };
            }
        }
        return true;
    }

}
