/*
@author lushuai
@date  2020/3/3-17:07
题目描述：缺失的第一个正数
*/
public class Leetcode41 {
    public static void main(String[] args) {
        int[] nums={3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
    //这题怎么做呢，就是把有机会符合题意的正数弄到它符合顺序的位置上
    //比如把[3,4,-1,1]变成[1,-1,3,4],再循环一下就能找出来
    public static int firstMissingPositive(int[] nums){
        int length=nums.length;
        int i=0;
        while (i<length){
            //无效数字直接过
            if(nums[i]<=0||nums[i]==i+1||nums[i]>length){
                i++;
            }
            else if(nums[i]!=nums[nums[i]-1]){
                int tem=nums[i];
                nums[i]=nums[tem-1];
                nums[tem-1]=tem;
            }else {
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1)
               return j+1;
        }
        return length+1;
    }
}
