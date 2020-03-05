import java.util.HashMap;
import java.util.Map;

/*
@author lushuai
@date  2019/9/10-11:25
题目描述：
给定一个整数数组和一个整数 k，
判断数组中是否存在两个不同的索引 i 和 j，
使 nums [i] = nums [j]，并且 i 和 j 的绝对差值最大为 k。


*/
public class Leetcode219 {
    public static void main(String[] args) {

    }
    public static boolean containsNearbyDuplicate(int[] nums, int k){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i])<=k)  return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
