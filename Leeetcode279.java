/*
@author lushuai
@date  2019/8/19-11:25
*/
public class Leeetcode279 {
    public static void main(String[] args) {

    }
    public int numSquares(int n){
        int dp[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = i; // 最多都由1组成
            for (int j = 1; j * j <= i; j++)
                // 0-1背包
                dp[i] = Math.min(dp[i - j * j] + 1, dp[i]);
        }
        return dp[n];
    }
}
