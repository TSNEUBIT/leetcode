/*
@author lushuai
@date  2020/2/19-18:06
*/
public class Sort {
    public static void main(String[] args) {
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    //快速排序
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
