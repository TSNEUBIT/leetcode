import java.util.Arrays;

/*
@author lushuai
@date  2019/9/10-11:42
题目描述：
给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 n/2 的元素。
你可以假设数组是非空的，并且数组中的众数永远存在。
思路一：排序，取中点
*/
public class Leetcode169 {
    public static void main(String[] args) {

    }
    public static int majorityElement(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
