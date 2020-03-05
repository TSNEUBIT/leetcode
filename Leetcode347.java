
import java.util.*;

/*
@author lushuai
@date  2019/8/31-14:44
题目描述：给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
例如，给定数组 [1,1,1,2,2,3] , 和 k = 2，返回 [1,2]。
注意：

你可以假设给定的 k 总是合理的，1 ≤ k ≤ 数组中不相同的元素的个数。
你的算法的时间复杂度必须优于 O(n log n) , n 是数组的大小
*/
public class Leetcode347 {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        System.out.println(topKFrequent(nums,2));
    }

    public static List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //遍历数组，把出现的数字以及出现的次数，存到哈希表中
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        maxHeap.addAll(map.entrySet());
        List<Integer> res = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            res.add(maxHeap.poll().getKey());
        }
        return res;
    }
}
