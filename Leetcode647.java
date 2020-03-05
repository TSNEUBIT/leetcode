/*
@author lushuai
@date  2019/8/29-10:03
优秀的解法：

*/
public class Leetcode647 {
    public static void main(String[] args) {
        //验证isPalindromic函数是否正确
        System.out.println(isPalindromic("aaa"));
        System.out.println(isPalindromic("abcba"));
        System.out.println(isPalindromic("asdf"));
    }
    //很明显这是一道dp的题，从左到右遍历字符串，每次加进一个字符，递推公式为dp[i]=dp[i-1]+count。
    // 其中，count为新加进一个字符后新增加的回文子串的个数。
    // 当遍历到index=i时，只要看看在i之前的index j，能否构成substring(j,i+1)的回文子串。
    // 最后结果是dp[len-1]+len，其中len为字符串的长度，因为字符串每个字符都为回文子串。

    public static int countSubstrings1(String s) {
        int len = s.length();
        int[] dp = new int[len];
        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    String substr = s.substring(j, i + 1);
                    if (isPalindromic(substr)) count++;
                }
                dp[i] = dp[i - 1] + count;
            }
        }
        return dp[len - 1] + len;
    }
    public static boolean isPalindromic(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }

    //leetcode上的解法
    public static int count;
    public static int countSubstrings(String s){
        if(s.length()==0) return 0;
        for(int i=0;i<s.length();i++){  //i代表中间的值
            extendPalindrome(s,i,i);     //以i为中心，字符串总长度为奇数
            extendPalindrome(s,i,i+1);//以i为中心，字符串总长度为偶数
        }
        return count;
    }
    public static void  extendPalindrome(String s,int left,int right){
        while (left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }
    }

}
