/*
@author lushuai
@date  2020/2/15-15:53
题目描述：
现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
n<=39
*/
public class Offer10 {
    public static void main(String[] args) {
        //  System.out.println(Fibonacci1(100));
        System.out.println(Fibonacci2(5));
        System.out.println(Fibonacci2(100));
    }
    public static int Fibonacci1(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return Fibonacci1(n-1)+Fibonacci1(n-2);
    }
    public static int Fibonacci2(int n){
        int[] result={0,1};
        if(n<2) return result[n];
        int res=0;
        int r1=0;
        int r2=1;
        for (int i=2;i<=n;i++){
            res=r1+r2;
            r1=r2;
            r2=res;
        }
        return res;
    }
}
