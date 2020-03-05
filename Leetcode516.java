/*
@author lushuai
@date  2019/9/25-16:42
题目描述：
最长回文子序列：给定一个字符串s，找到其中最长的回文子序列。可以假设s的最大长度为1000。

示例
输入:
“bbbab”
输出:
4
一个可能的最长回文子序列为 “bbbb”。
*/
public class Leetcode516 {
    public static void main(String[] args) {

    }
    public static int longestPalindromeSubseq(String s){
        int[][] dp=new int[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            dp[i][i]=1;
            for(int j=i-1;j>=0;j--){
                if (s.charAt(i)==s.charAt(j)) dp[i][j]=dp[i+1][j-1]+2;
                else dp[i][j]= Math.max(dp[i + 1][j], dp[i][j - 1]);
            }
        }
        return dp[0][s.length()-1];
    }
}
