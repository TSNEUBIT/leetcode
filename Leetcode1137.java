/*
@author lushuai
@date  2020/2/15-17:10
题目描述：
The Tribonacci sequence Tn is defined as follows:
T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
Given n, return the value of Tn.
*/
public class Leetcode1137 {
    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }
    public static int tribonacci(int n){
        int[] result={0,1,1};
        if(n<3) return result[n];
        int r1=0;
        int r2=1;
        int r3=1;
        int res=0;
        for(int i=3;i<=n;i++){
            res=r1+r2+r3;
            r1=r2;
            r2=r3;
            r3=res;
        }
        return res;
    }
}
