/*
@author lushuai
@date  2019/5/21-10:23
昨天做完leetcode05，今天把同类型的几道题
这道题主要是熟悉Java的API--Character类中的常用方法
*/
public class Leetcode125 {
    public static void main(String[] args){
        String s=("A man, a plan, a canal: Panama");
        System.out.println(isPalindrome(s));

    }
    public static boolean isPalindrome(String s){
        if(s.length()<=1)
            return true;
        int l=0;
        int r=s.length()-1;
        while (l<r)
        {
            //确定指定的字符是否是字母或者数字
            if(!Character.isLetterOrDigit(s.charAt(l)))
                l++;
            else if(!Character.isLetterOrDigit(s.charAt(r)))
                r--;
            else{
                if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r)))
                    return false;

                    l++;
                    r--;

            }
        }
        return true;
    }
}
