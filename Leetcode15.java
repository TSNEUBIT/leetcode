import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
@author lushuai
@date  2019/5/22-11:13
经典的3sum问题
这道题看起来很重要
思路：可以先将数组排序，然后转化成两个数之和的问题，采取对撞指针法
写完了，也理解了，真是一道不错的题
*/
public class Leetcode15 {
    public static void main(String[] args){
        int[] nums={-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));

    }
    public static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);              //排序
        List<List<Integer>> res = new LinkedList<>();
        for(int i=0;i<nums.length-2;i++)            //注意理解为什么是减二
        {
            if(i==0||(i>0&&nums[i]!=nums[i-1])){      //防止出现三元重复组
                int l=i+1,r=nums.length-1,sum=-nums[i];
                while(l<r)
                {
                    if(nums[l]+nums[r]==sum){
                        res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                        //Arrays.aslist将数组转化为集合，把符合要求的数组元素放入list集合中，也是后面防止出现三元重复组的原理
                        while(l<r&&nums[l]==nums[l+1]) l++;     //防止出现三元重复组
                        while(l<r&&nums[r]==nums[r-1]) r--;
                        l++;
                        r--;
                    }
                    else if(nums[l]+nums[r]<sum)
                        l++;
                    else
                        r--;
                }
            }
        }
        return res;
    }
}
