package gn.k48.books.PointOffer;

public class Solution19 {
    static int m;
    static int n;
    static int [][] f;
    public static boolean isMatch(String s, String p) {
        n = s.length();
        m = p.length();
        f = new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                f[i][j]=-1;
            }
        }
        return dp(0,0,s.toCharArray(),p.toCharArray());
    }

    public static boolean dp(int x,int y,char[] s,char[] p){
        if(f[x][y]!=-1)return f[x][y]==1;
        if(y==m){
            f[x][y]=(x==n?1:0);
            return f[x][y]==1;
        }
        boolean firstMatch = x<n&&(s[x]==p[y]||p[y]=='.');
        boolean ans;
        if(y+1<m&&p[y+1]=='*')
            ans=dp(x,y+2,s,p)//*匹配0个
                    ||firstMatch&&dp(x+1,y,s,p);//*匹配n个
        else
            ans=firstMatch&&dp(x+1,y+1,s,p);//
        f[x][y]=ans?1:0;
        return ans;
    }

    public static void main(String[] args) {
        String s1="aaa";
        String p1="a.a";
        String p2="ab*ac*a";
        String p3="a.b*a";
        String s2="a";
        String p4="";
        String s3="";
        String p5=".*";
        System.out.println(isMatch(s1,p1));
        System.out.println(isMatch(s1,p2));
        System.out.println(isMatch(s1,p3));
        System.out.println(isMatch(s2,p4));
        System.out.println(isMatch(s3,p5));
    }
}
