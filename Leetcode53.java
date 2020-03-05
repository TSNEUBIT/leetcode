/*
@author lushuai
@date  2019/7/20-10:22
最大连续子数组和
题目描述：
给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
输入: [-2,1,-3,4,-1,2,1,-5,4]；输出: 6；解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
尽量实现复杂度为O(n)的算法，还可以采用分治的方法。

这里直接给出最优的解法
*/
public class Leetcode53 {
    public static void main(String[] args){

    }
    public static int maxSubArray(int[] nums){
        int n=nums.length;
        int[] dp = new int[n];    //dp[i]是最后一个元素为nums[i]的最大子数组
        dp[0]=nums[0];
        int max=dp[0];
        for(int i=1;i<n;i++)
        {
            dp[i]=nums[i]+(dp[i-1]>0?dp[i-1]:0);
            max=Math.max(max,dp[i]);
        }
        return max;
    }


}
