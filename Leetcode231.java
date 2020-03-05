/*
@author lushuai
@date  2019/9/7-9:32
题目描述：给定一个整数，编写一个函数来判断它是否是 2 的幂次方。

*/
public class Leetcode231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(128));
    }
    public static boolean isPowerOfTwo(int n){
        if(n<=0) return false;
        else if(n==1) return true;
            while (n%2==0){
                n=n/2;
            }
        return n==1;
    }
}
