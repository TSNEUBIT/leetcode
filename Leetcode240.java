/*
@author lushuai
@date  2020/2/15-18:49
*/
public class Leetcode240 {
    public static void main(String[] args) {

    }
    public static boolean searchMatrix(int[][] matrix, int target){
        if(matrix.length<1||matrix[0].length<1||target<matrix[0][0]||target>matrix[matrix.length-1][matrix[0].length-1])
            return false;
        int row=0;
        int col=matrix[0].length-1;
        while (row<matrix.length&&col>=0){
            if(target>matrix[row][col]){
                row++;
            }else if(target<matrix[row][col]){
                col--;
            }else {
                return true;
            }
        }
        return false;
    }
}
