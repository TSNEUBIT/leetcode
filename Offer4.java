/*
@author lushuai
@date  2019/12/11-21:15
二维数组中的查找
在一个二维数组中，每一行从左到右递增，每一列从上到下递增。
实现一个函数，输入二维数组和整数，判断数组中是否含有该整数
*/
public class Offer4 {
    public static void main(String[] args) {
        int[][] nums={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int a=10;
        System.out.println(Find(a,nums));
    }
    public static boolean Find(int target, int [][] array){
        int row=0;
        int col=array[0].length-1;
        while (row<array.length&&col>=0){
            int nums=array[row][col];
            if(target>nums){
                row++;
            }else if(target<nums){
                col--;
            }else {
                return true;
            }
        }
        return false;
    }
}
