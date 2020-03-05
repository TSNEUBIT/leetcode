/*
@author lushuai
@date  2019/9/14-21:52
题目描述：寻找重复数。给定一个包含 n + 1 个整数的数组 nums，
其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。
假设只有一个重复的整数，找出这个重复的数。
证明的参考链接：https://blog.csdn.net/To_be_to_thought/article/details/83958314
*/
public class Leetcode287 {
    public static void main(String[] args) {
        int[] nums={3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums){
        int slow=nums[0];
        int fast=nums[nums[0]];
        while (slow!=fast){
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        fast=0;
        while (slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}
