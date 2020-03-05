import java.util.HashMap;
import java.util.Map;

/*
@author lushuai
@date  2019/7/20-15:32
题目描述：
给定一个非空且只包含非负数的整数数组nums, 数组的度的定义是指数组里任一元素出现频数的最大值。
你的任务是找到与nums拥有相同大小的度的最短连续子数组，返回其长度。

示例1：
输入: [1, 2, 2, 3, 1]
输出: 2
解释:
输入数组的度是2，因为元素1和2的出现频数最大，均为2.
连续子数组里面拥有相同度的有如下所示:
[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
最短连续子数组[2, 2]的长度为2，所以返回2。

示例2：
输入: [1,2,2,3,1,4,2]
输出: 6

思路：
*/
public class Leetcode697 {
    public static void main(String[] args) {

    }

    public int findShortestSubArray(int[] nums) {
        int len = nums.length;
        if (len == 0)
            return 0;

        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> start = new HashMap<>();
        Map<Integer, Integer> end = new HashMap<>();
        int max = 0;
        for (int i = 0; i < len; i++) {
            if (!count.containsKey(nums[i])) {    //第一次出现的数字
                count.put(nums[i], 0);           //放入count计数map中
                start.put(nums[i], i);           //值和第一次出现的次序放入start的map中
            }
            //不是第一次出现的数字，放入end的map中，get方法的作用是返回指定的key对应的value
            end.put(nums[i], i);
            count.put(nums[i], count.get(nums[i]) + 1);
            max = Math.max(max, count.get(nums[i]));
        }
        int min =Integer.MAX_VALUE;    //整数的最大值，2的31次方减一
        for (Integer key : count.keySet())//keySet方法，返回map中所有key组成的set集合，在本题中就是得到所有的数字
        {
            if (count.get(key) == max)
                min = Math.min(min, end.get(key) - start.get(key) + 1);
        }
        return min;
    }
}