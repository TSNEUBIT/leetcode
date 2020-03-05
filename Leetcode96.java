/*
@author lushuai
@date  2019/8/20-17:29
题目描述：给定一个整数 n，求以 1 ... n 为节点组成的二叉搜索树有多少种？
tag：动态规划。
参考链接：https://zhuanlan.zhihu.com/p/66447390

*/
public class Leetcode96 {
    public static void main(String[] args) {

    }
    public int numTrees(int n){
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
}
