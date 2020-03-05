import java.util.HashMap;
import java.util.Map;

/*
@author lushuai
@date  2019/10/24-22:31
题目描述：连续数组
给定一个二进制数组, 找到含有相同数量的 0 和 1 的最长连续子数组（的长度）。
首先对原数组做处理，将所有的0都变为-1；这样一来 “含有相同数量的 0 和 1 的连续数组” 就等价为 “元素值总和为0的连续数组”。
其后，从头扫一遍数组，并记录当前的前缀和的值，将该值和对应的下标存入到一个标记数组或哈希表中。
若该前缀和的值已出现过（即标记数组或哈希中已存在），则说明标记中的下标到当前扫描的下标的这段数组的总和值是为0的。

这算不算是滑动窗口的思想呢，
*/

public class Leetcode525 {
    public static void main(String[] args) {

    }
    public static int findMaxLength(int[] nums){
        //将数组中所有的0都换成-1
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) nums[i]=-1;
        }
        Map<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int max=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum)){
                max=Math.max(max,i-map.get(sum));
            }
            else {
                map.put(sum,i);
            }
        }
        return max;
    }
}
