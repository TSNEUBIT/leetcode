/*
@author lushuai
@date  2019/9/9-11:42
判断一个数是不是3的幂次方
给定一个整数，写一个函数来判断它是否是 3 的幂次方。

示例 1:
输入: 27
输出: true
示例 2:
输入: 0
输出: false
示例 3:
输入: 9
输出: true
示例 4:
输入: 45
输出: false
进阶：
你能不使用循环或者递归来完成本题吗
*/
public class Leetcode326 {
    public static void main(String[] args) {

    }
    public static boolean isPowerOfThree1(int n){
        if(n<=0) return false;
        else if (n==1) return true;
        while (n%3==0){
            n=n/3;
        }
        return n==1;
    }

    public static boolean isPowerOfThree2(int n){
        // 1162261467 is 3^19,  3^20 is bigger than int
        return ( n>0 &&  1162261467%n==0);
    }

    //穷举法
    public static boolean isPowerOfThree3(int n){
        return (n == 1 || n == 3 || n == 9 || n == 27 || n == 81 || n == 243 || n == 729 || n == 2187 || n == 6561 || n == 19683 || n == 59049 || n == 177147 || n == 531441 || n == 1594323 || n == 4782969 || n == 14348907 || n == 43046721 || n == 129140163 || n == 387420489 || n == 1162261467);
    }


}
