import java.util.Arrays;

/*
@author lushuai
@date  2019/9/14-20:48
题目描述：
给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
示例:
示例 1:

输入: [3,0,1]
输出: 2
示例 2:

输入: [9,6,4,2,3,5,7,0,1]
输出: 8
说明:

你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现?
*/
public class Leetcode268 {
    public static void main(String[] args) {
        int[] nums={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber1(nums));
    }
    public static int missingNumber1(int[] nums){
        Arrays.sort(nums);
        int left=0;
        int right=nums.length;
        int mid=left+(right-left)/2;
        while (left<right){
            mid=left+(right-left)/2;
            if(nums[mid]>mid)
                 right=mid;
            else
                left=mid+1;
        }
        return left;
    }
    public static int missingNumber2(int[] nums){
        int len=nums.length,sum=0;
        for(int i=0;i<len;i++){
            sum+=nums[i];
        }
        return (len+1)*len/2-sum;
    }
}
