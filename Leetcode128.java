import java.util.Arrays;

/*
@author lushuai
@date  2019/8/26-22:13
题目描述：给一个数组，求出连续的数字最多有多少个，时间复杂度要求是O(n)
方法一：暴力解法：直接用排序，应该是不行，时间复杂度超过了O(n)，虽然AC了。
方法二：
*/
public class Leetcode128 {
    public static void main(String[] args) {
        int[] nums={100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive1(nums));

    }
    public static int longestConsecutive1(int[] nums){
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        Arrays.sort(nums);
        int res=1;
        for(int i=0;i<nums.length;i++)
        {
            int len=1;
            while (i<nums.length-1&&(nums[i]==nums[i+1]||nums[i]+1==nums[i+1]))
            {
                if(nums[i]+1==nums[i+1])
                    len++;
                    i++;
            }
            res=Math.max(res,len);
        }
        return res;
    }

}
