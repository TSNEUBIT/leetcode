/*
@author lushuai
@date  2019/7/26-15:53
跳跃游戏
给定一个非负整数数组，你最初位于数组的第一个位置。
数组中的每个元素代表你在该位置可以跳跃的最大长度。
判断你是否能够到达最后一个位置。

示例 1:
输入: [2,3,1,1,4]
输出: true
解释: 从位置 0 到 1 跳 1 步, 然后跳 3 步到达最后一个位置。

示例 2:
输入: [3,2,1,0,4]
输出: false
解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。
*/
public class Leetcode55 {
    public static void main(String[] args) {

    }

    public boolean canJump(int[] nums){
        //先解决掉两个特殊情况
        if(nums==null)
            return false;
        if(nums.length==1)
            return true;
        int reachable=0;
        for(int i=0;i<nums.length;i++)
        {
            //reachable的含义就是在数组中的第i个元素处能达到的最远处
            reachable=Math.max(reachable,i+nums[i]);
            //能达到的最远处不大于i的话，就无法向前走了，就是0很多的情况
            if(reachable<=i)
                return false;
            if (reachable>=nums.length-1)
                return true;
        }
        return false;
    }
}
