/*
@author lushuai
@date  2019/8/19-20:31
Unique Paths II
题目描述：
一个机器人位于一个 m x n 网格的左上角
机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角。
现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
网格中的障碍物和空位置分别用 1 和 0 来表示。

说明：m 和 n 的值均不超过 100。

示例 1:
输入:
[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]
输出: 2
*/
public class Leetcode63 {
    public static void main(String[] args) {
        int[][] test={{0,1,0,0,0},{0,0,0,1,0},{0,0,0,0,0}};
        System.out.println(uniquePathsWithObstacles(test));
    }
    //DP的方法，和62题很相似，动态方程是一样的，边界条件略有区别
    public static int uniquePathsWithObstacles(int[][] obstacleGrid){
        //定义二维矩阵的常用方法
        int[][] ways=new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i=0;i<obstacleGrid.length;i++){
            for(int j=0;j<obstacleGrid[0].length;j++){
                //如果遇到障碍物的地方走不了，也就是去此地的路径个数是0
                if(obstacleGrid[i][j]==1)
                    ways[i][j]=0;
                else if(i==0&&j==0)
                    ways[i][j]=1;
                else if(i==0&&j>0)
                    //和62题不同，这里不一定是1，因为第一行中可能出现障碍物
                    ways[i][j]=ways[i][j-1];
                else if(i>0&&j==0)
                    ways[i][j]=ways[i-1][j];
                else ways[i][j]=ways[i-1][j]+ways[i][j-1];
            }
        }
        return ways[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
