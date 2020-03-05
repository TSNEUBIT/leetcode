/*
@author lushuai
@date  2019/9/25-2:36
两个字符串的删除操作
题目描述：

给定两个单词 word1 和 word2，找到使得 word1 和 word2 相同所需的最小步数，每步可以删除任意一个字符串中的一个字符。

示例 1:

输入: "sea", "eat"
输出: 2
解释: 第一步将"sea"变为"ea"，第二步将"eat"变为"ea"
说明:

给定单词的长度不超过500。
给定单词中的字符只含有小写字母。

分析：我们可以只关注结果，实际上就是求两个字符串的最长子序列，dp的方法
*/
public class Leetcode583 {
    public static void main(String[] args) {
        String word1="eat";
        String word2="seact";
        System.out.println(minDistance(word1,word2));
    }
    public static int minDistance(String word1, String word2){
        int len1=word1.length();
        int len2=word2.length();
        int[][] dp=new int[len1+1][len2+1];
        for(int i=0;i<=len1;i++){
            for(int j=0;j<=len2;j++){
                if(i==0||j==0)
                    dp[i][j]=0;
                else if(word1.charAt(i-1)==word2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        return word1.length()+word2.length()-2*dp[len1][len2];
    }
}
