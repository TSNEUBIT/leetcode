/*
@author lushuai
@date  2019/6/5-15:32
tag：数组或者是矩阵，数学什么的
这个题算是各种矩阵操作的题目，拿笔写一写就出来了
*/
public class Leetcode48 {
    public static void main(String[] args){
       int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};    //初始化二维数组的方法


    }
    public static void rotate(int[][] matrix){
        int n=matrix.length;
        if(matrix==null||matrix.length==0)
            return;
        for(int i=0;i<n/2;i++)
        {
            for(int j=i;j<n-1-i;j++)    //注意此处的循环条件，这个解法是一层一层的旋转，所以j的范围要两头堵，是对称的
            {
                int tmp=matrix[i][j];
                //注意下面这四个的顺序，因为要求不使用额外的空间，所以赋值是一个循环。
                matrix[i][j]=matrix[n-j-1][i];
                matrix[n-j-1][i]=matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1]=matrix[j][n-i-1];
                matrix[j][n-i-1]=tmp;
            }
        }
    }
}
