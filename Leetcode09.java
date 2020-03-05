/*
@author lushuai
@date  2020/2/20-13:08
*/
public class Leetcode09 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
    public static boolean isPalindrome(int x){
        String s=String.valueOf(x);
        int l=0;
        int r=s.length()-1;
        while (l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
