package PointOffer;

public class Solution4 {
    public static String replaceSpaces(StringBuffer str) {
        for(int i=0;i<str.length();i++){
            if(' '==str.charAt(i)){
                str.replace(i,i+1,"%20");
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("we watch you");
       // sb.replace(1,5,"%20");
        //System.out.println(sb.toString());
        System.out.println(replaceSpaces(sb));
    }
}
