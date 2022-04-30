package gn.k48.interview.YueGangAo;

public class YueGangAo1 {

    public static void getXY(int i){
        int x = 0,y =0;
        int lastX = 0,lastY=0;
        while(i--!=0){
            if(y==0){
                if(x==0||y!=lastY){
                    lastX = x;
                    lastY = y;
                    x++;
                }
                else if(y==lastY) {
                    lastX = x;
                    lastY = y;
                    x--;
                    y++;
                }
            }
            else {
                if(x==0){
                    if(x!=lastX){
                        lastX = x;
                        lastY = y;
                        y++;
                    } else {
                        lastX = x;
                        lastY = y;
                        x++;
                        y--;
                    }
                }
                else{
                    x+=(x-lastX);
                    y+=(y-lastY);
                }
            }

        }
        System.out.println("x="+x+",y="+y);

    }

    public static void main(String[] args) {
        getXY(8);
        getXY(7);
    }
}
