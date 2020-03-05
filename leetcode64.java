/*
@author lushuai
@date  2019/8/4-22:33
我明白了，这道题加的是grid[i][j]就已经代表了加的数，所以会给人一种动态规划算法没有初始化的假象
*/
public class leetcode64 {
    public static void main(String[] args) {
        int[][] m={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(m));
    }
    public static int minPathSum(int[][] grid){
        if(grid.length==0||grid[0].length==0)
            return 0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(i==0&&j==0) continue;
                if(i==0)
                    grid[i][j]+=grid[i][j-1];
               else if(j==0)
                    grid[i][j]+=grid[i-1][j];
                else grid[i][j]+=Math.min(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}
