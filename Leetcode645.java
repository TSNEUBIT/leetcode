import java.util.Arrays;

/*
@author lushuai
@date  2019/9/14-22:57
题目描述：
集合 S 包含从1到 n 的整数。
不幸的是，因为数据错误，导致集合里面某一个元素复制了成了集合里面的另外一个元素的值，导致集合丢失了一个整数并且有一个元素重复。
给定一个数组 nums 代表了集合 S 发生错误后的结果。你的任务是首先寻找到重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。

示例 1:
输入: nums = [1,2,2,4]
输出: [2,3]
注意:

给定数组的长度范围是 [2, 10000]。
给定的数组是无序的

tips:凡是要节约空间的题目 都在输入数据上下功夫 不要担心破坏原始的input
思路：先排序，前后相等即为重复，用和判断多的数
*/
public class Leetcode645 {
    public static void main(String[] args) {

    }
    public static int[] findErrorNums(int[] nums){
        int len=nums.length;
        Arrays.sort(nums);
        int pre=nums[0];
        int sum=nums[0];
        int[] res=new int[2];
        for(int i=1;i<len;i++){
            sum+=nums[i];
            if(pre==nums[i])
                res[0]=pre;
            pre=nums[i];
        }
        res[1]=(1+len)*len/2-sum+res[0];
        return res;

    }

}
