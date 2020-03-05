import java.util.HashMap;
import java.util.Map;

/*
@author lushuai
@date  2019/4/23-19:05
*/
public class Leetcode01 {
    public static void main(String[] args) {
        int[] nums={2, 7, 11, 15};
        int target=9;
        int[] a=twoSum1(nums,target);

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
       // System.out.println(twoSum1(nums,target));

    }

    public static int[] twoSum1(int[] nums,int target){
        int n=nums.length;
        int[] result=new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(target-nums[i])) {
                result[1]=i;
                result[0]=map.get(target-nums[i])-1;
                return result;
            }
            map.put(nums[i], i+1);
        }
        return result;
    }

    public static int[] twoSum2(int[] nums,int target){
        int result[] = new int[2];      //定义固定长度为2的数组

        for(int i=0;i<nums.length;i++)
        {
            int m=target-nums[i];
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==m&&j!=i){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }
}
