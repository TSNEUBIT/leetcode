/*
@author lushuai
@date  2020/2/20-13:41
题目描述：三个数，有重复，原地排序

*/
public class Leetcode75 {
    public static void main(String[] args) {

    }
    public void sortColors(int[] nums){
        quickSort(nums,0,nums.length-1);
    }
    public static void quickSort(int[] arr,int low,int high){
        int i,j,tem,t;
        if(low>high) return;
        i=low;
        j=high;
        //tem就是基准位
        tem=arr[low];
        while (i<j) {
            //先看右边，依次往左递减
            while (tem <= arr[j] && i < j) {
                j--;
            }
            //再看左边，依次往右递增
            while (tem >= arr[i] && i < j) {
                i++;
            }
            //如果满足条件交换
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        arr[low] = arr[i];
        arr[i] = tem;
        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);

    }
}
