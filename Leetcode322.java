import java.util.Arrays;

/*
@author lushuai
@date  2019/9/9-21:02
零钱兑换
题目描述：
给定不同面额的硬币 coins 和一个总金额 amount。
编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1
说明：假设每种硬币的数量是无穷的
参考网址：https://blog.csdn.net/yysave/article/details/90899963
思路：首先明确一点，不能直接暴力贪心算法。
dp[i]代表金额为i的最优解，即最少使用的张数
在计算dp[i]时，dp[0]到dp[i-1]都是已知的
*/
public class Leetcode322 {
    public static void main(String[] args) {

    }
    public static int coinChange(int[] coins, int amount){
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                if (dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
        }
}
