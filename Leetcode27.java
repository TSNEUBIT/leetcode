/*
@author lushuai
@date  2019/6/4-9:21
题目描述：移除数组中的指定元素，在原地
*/
public class Leetcode27 {
    public static void main(String[] args){

    }

    public static int removeElement(int[] nums, int val){
        int j=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=val)
                nums[j++]=nums[i];
        }
        return j;
}
}
