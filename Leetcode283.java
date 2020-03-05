/*
@author lushuai
@date  2019/6/1-11:23
*/
public class Leetcode283{
    public static void main(String[] args){
        int[] nums={0,1,0,3,12};
        System.out.println(moveZeroes(nums));

    }
    public static int[] moveZeroes(int[] nums){
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
                nums[k++]=nums[i];
        }
        for(int i=k;i<nums.length;i++)
        {
            nums[i]=0;
        }
        return nums;
    }
}
