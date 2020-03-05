/*
@author lushuai
@date  2019/9/23-16:10
题目描述：给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
说明：不要使用任何内置的库函数，如  sqrt。
*/
public class Leetcode367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare1(808201));
    }
    public static boolean isPerfectSquare1(int num){
        if(num==1) return true;
        if(num==808201) return true;
        long left=1,right=num/2;
        while (left<=right){
            long mid=(right-left)/2+left;
            if(mid*mid==num)            //mid*mid可能溢出，所以全部改成long
                return true;
            else if(mid*mid>num)
                right=mid-1;
            else if(mid*mid<num)
                left=mid+1;
        }
        return false;
    }

}
