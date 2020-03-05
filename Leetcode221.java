/*
@author lushuai
@date  2019/7/23-14:25
题目描述：在一个二维01矩阵中找到全为1的最大正方形
样例：
1 0 1 0 0
1 0 1 1 1
1 1 1 1 1
1 0 0 1 0
思路：动态规划，dp[i][j]和左上，左，上三个位置最大能延长的正方形边长有有关，如果dp[i][j]等于1，
则是三个位置的最小值加1，这三个位置不一定是1，因为它们也是由它们各自的左上，左，上三个位置得出的
如果这三个位置都是2，就存在一个3*3的正方形。
总的来说，用两重for循环遍历矩阵
如图所示
1 1 1
1 1 1
1 1 1
*/
public class Leetcode221 {
    public static void main(String[] args){

    }
    public int maximalSquare(char[][] matrix){
        if(matrix==null||matrix.length==0||matrix[0].length==0)
            return 0;
        int m=matrix.length;
        int n=matrix[0].length;
        int res=0;
        int [][]dp = new int[m+1][n+1];
        for(int i=0;i<m;i++)    //注意这里的遍历，如果i从0开始，就是小于m
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]=='1'){
                    dp[i+1][j+1]=Math.min(Math.min(dp[i][j+1],dp[i][j]),dp[i+1][j])+1;//递归方程，动态规划的核心
                    res=Math.max(res,dp[i+1][j+1]);//每次循环更新最大的边长
                }
            }
        }
        return res*res;
    }

}

