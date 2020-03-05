/*
@author lushuai
@date  2019/9/25-11:43
题目描述
给定两个字符串 text1 和 text2，返回他们的最长公共子序列的长度。

一个字符串的子序列是一个从原字符串中新生成的字符串，且该新字符串是原字符串删掉一些字符但不改变字符相对顺序生成的。
（例如，”ace” 是 “abcde” 的一个子序列，但 “aec” 不是）。两个字符串的公共子序列是一个对两个字符串都相同的子序列。

如果没有公共子序列，返回 0。
样例
输入：text1 = "abcde", text2 = "ace"
输出：3
解释：最长公共子序列是 "ace"，且长度为 3。
输入：text1 = "abc", text2 = "abc"
输出：
解释：最长公共子序列是 "abc"，且长度为 3
*/
public class Leetcode1143 {
    public static void main(String[] args) {
        String word1="eat";
        String word2="seact";
        System.out.println(longestCommonSubsequence(word1,word2));

    }
    public static int longestCommonSubsequence(String text1, String text2){
        int len1=text1.length();
        int len2=text2.length();
        int[][] dp=new int[len1+1][len2+1];     //这里定义的数组长度不能小于这个，否则数组下标越界
        for(int i=0;i<=len1;i++){
            for (int j=0;j<=len2;j++){
                if(i==0||j==0)
                    dp[i][j]=0;
                else if(text1.charAt(i-1)==text2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else dp[i][j]= Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        return dp[len1][len2];
    }

}
