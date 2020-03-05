/*
@author lushuai
@date  2019/5/21-11:14
题目描述：反转字符串，不使用额外空间
注意String char[]之间的相互转化
*/
public class Leetcode344 {
    public static void main(String[] args){
        String s=("asdfg");
        System.out.println(reverseString(s));

    }
    public static String reverseString(String s){
        char[] word=s.toCharArray();            //String类转化为char[]
        int l=0,r=s.length()-1;
        while(l<r)
        {
            char temp=word[l];
            word[l]=word[r];
            word[r]=temp;
            l++;
            r--;
        }

        return new String(word);
    }
}
