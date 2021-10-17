package Huawei;

import java.util.*;

public class Huawei2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int t = in.nextInt();
            StringBuilder sb = new StringBuilder();
            while(t!=0){
                int b = (t-1)%26;
                t = (t-1)/26;
                sb.append((char)(b+'a'));
            }
            System.out.println(sb.reverse().toString());
        }
    }
}
