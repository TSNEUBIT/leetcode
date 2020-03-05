/*
@author lushuai
@date  2019/8/14-22:21
leetcode189,生成旋转数组，3reverse方法
*/
public class Leetcode189 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;

    }
    public static void rotate(int[] nums, int k){
        k%=nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public static void reverse(int[] nums,int i,int j){
        while (i<j)
        {
            int tem=nums[i];
            nums[i]=nums[j];
            nums[j]=tem;
            i++;
            j--;
        }
    }
}
