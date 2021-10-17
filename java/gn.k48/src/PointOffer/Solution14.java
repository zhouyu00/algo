package PointOffer;

public class Solution14 {
    /*
    这道题目是数学中一个很经典的问题。
    下面我们给出证明：

    首先把一个正整数 NN 拆分成若干正整数只有有限种拆法，所以存在最大乘积。
    假设 N=n1+n2+…+nkN=n1+n2+…+nk，并且 n1×n2×…×nkn1×n2×…×nk 是最大乘积。

    显然1不会出现在其中；
    如果对于某 i 有 ni≥5，那么把 ni 拆分成 3+(ni−3)，我们有 3(ni−3)=3ni−9>ni
    如果 ni=4，拆成 2+2乘积不变，所以不妨假设没有4；
    如果有三个以上的2，那么 3×3>2×2×2，所以替换成3乘积更大；
    综上，选用尽量多的3，直到剩下2或者4时，用2。

    时间复杂度分析：当 nn 比较大时，nn 会被拆分成 ⌈n/3⌉⌈n/3⌉ 个数，我们需要计算这么多次减法和乘法，所以时间复杂度是 O(n)O(n)。

    作者：yxc
    链接：https://www.acwing.com/solution/acwing/content/731/
    来源：AcWing
    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */

    public static int maxProductAfterCutting(int length)
    {
        if(length<=3)return length-1;
        int res =1;
        int n=length/3;
        if(length%3==1) {
            res=4;
            n--;
        }
        if(length%3==2) res=2;
        while(n!=0){res*=3;n--;}
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxProductAfterCutting(8));
    }
}
