import java.util.LinkedList;
import java.util.List;

/*
@author lushuai
@date  2020/3/3-16:36
*/
public class Leetcode442 {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
    public static List<Integer> findDuplicates(int[] nums){
        List<Integer> res = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            while (nums[i]!=i+1&&nums[i]!=nums[nums[i]-1]){
                int tem=nums[i];
                nums[i]=nums[tem-1];
                nums[tem-1]=tem;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                res.add(nums[i]);
            }
        }
        return res;
    }
}
