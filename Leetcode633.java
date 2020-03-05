/*
@author lushuai
@date  2019/9/23-19:03
题目描述：判断一个数是不是两个整数的平方和
双指针法，left和right之间的等号什么时候有，什么时候没有，现在看起来都有比较保险
*/
public class Leetcode633 {
    public static void main(String[] args) {

    }
    public static boolean judgeSquareSum(int c){
        int left=0;
        int right=(int)(Math.sqrt(c));
        while (left<=right){
            if (c==left*left+right*right)
                return true;
            else if (c>left*left+right*right)
                left++;
            else if(c<left*left+right*right)
                right--;
        }
        return false;
    }
}
