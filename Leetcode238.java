/*
@author lushuai
@date  2019/10/28-13:20
题目描述：给定长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output，
         其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积
*/
public class Leetcode238 {
    public static void main(String[] args) {

    }
    public static int[] productExceptSelf(int[] nums){
        int n=nums.length;
        int[] res=new int[n];
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=1;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        right[n-1]=1;
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            res[i]=left[i]*right[i];
        }
        return res;
    }
}
