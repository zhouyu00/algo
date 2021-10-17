package Zhaoyin;

public class Zhaoyin2 {

    public static int[] tranArr (int[] arrA, int K) {
        int maxVal0 = Integer.MIN_VALUE;
        int minVal0 = Integer.MAX_VALUE;
        for(int i=0;i<arrA.length;i++){
            if(arrA[i]>maxVal0) maxVal0 = arrA[i];
            if(arrA[i]<minVal0) minVal0 = arrA[i];
        }
        int resVal0= maxVal0-minVal0;
        if(resVal0<=2*K){
            return new int[]{maxVal0-K,maxVal0-K};
        }

        return new int[]{minVal0+K,maxVal0-K};
    }

    public static void main(String[] args) {
        int[] res =tranArr(new int[]{-1,3,9},6);
        for(int i=0;i<res.length;i++) System.out.println(res[i]);

//        int[] res =tranArr(new int[]{1,8},3);
//        for(int i=0;i<res.length;i++) System.out.println(res[i]);
    }
}
