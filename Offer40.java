import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
/*
@author lushuai
@date  2020/2/20-16:47
题目描述：最小的k个数
输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,
*/
public class Offer40 {
    public static void main(String[] args) {
        int[] nums={4,5,1,6,2,7,3,8};
        System.out.println(GetLeastNumbers_Solution(nums,4));
    }
    //方法一：暴力解法
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k){
        ArrayList<Integer> res = new ArrayList<>();
        if(input==null||k<=0||k>input.length) return res;
        Arrays.sort(input);
        for(int i=0;i<k;i++){
            res.add(input[i]);
        }
        return res;
    }
    //最大堆：用最大堆保存这k个数，每次只和堆顶比，如果比堆顶小，删除堆顶，新数入堆
    public static ArrayList<Integer> GetLeastNumbers_Solution1(int [] input, int k){
        ArrayList<Integer> res = new ArrayList<>();
        if(k<=0||k>input.length||input==null) return res;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for(int i=0;i<input.length;i++){
            if(maxHeap.size()<k){
                maxHeap.add(input[i]);
            }else if(maxHeap.peek()>input[i]){
                int tem=maxHeap.poll();
                maxHeap.add(input[i]);
            }
        }
        for(Integer integer:maxHeap){
            res.add(integer);
        }
        return res;
    }
}
