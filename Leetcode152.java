/*
@author lushuai
@date  2019/8/20-21:31
*/
public class Leetcode152 {
    public static void main(String[] args) {
        int[] nums={2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums){
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int maxAll=nums[0];//全局最大乘积
        int maxLast=nums[0];//连乘到上个元素的最大乘积
        int minLast=nums[0];//连乘到上个元素的最小乘积
        int maxCur;//连乘到当前元素的最大乘积
        int minCur;//连乘到当前元素的最小乘积
        for(int i=1;i<nums.length;i++){     //第一次这里的i的起始值写错了，开始写成了0，应该是1,注意初始条件
            maxCur=Math.max(nums[i],Math.max(maxLast*nums[i],minLast*nums[i]));
            minCur=Math.min(nums[i],Math.min(maxLast*nums[i],minLast*nums[i]));
            maxLast=maxCur;
            minLast=minCur;
            maxAll=Math.max(maxCur,maxAll);
        }
        return maxAll;
    }
}
