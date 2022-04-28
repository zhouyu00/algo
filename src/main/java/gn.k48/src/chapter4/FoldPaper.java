package chapter4;

public class FoldPaper {
    public static void printAllFolds(int N){
        printProcess(1,N,true);
    }

    public static void printProcess(int i,int N,boolean down){
        if(i>N){
            return;
        }
        printProcess(i+1,N,true);
        System.out.println(down?"down":"up");
        printProcess(i+1,N,false);
    }

    public static void main(String[] args) {
        int N=3;
        printAllFolds(N);
    }
}
