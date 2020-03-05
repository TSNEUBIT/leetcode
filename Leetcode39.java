import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
@author lushuai
@date  2019/10/17-11:50
题目描述：给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
        candidates 中的数字可以无限制重复被选取。
*/
public class Leetcode39 {
    public static void main(String[] args) {
        int[] num={2,3,6,7};
        int target=7;
        System.out.println(combinationSum(num,target));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target){
        int len=candidates.length;
        List<List<Integer>> res = new ArrayList<>();//存放最后的结果

        //先对数组进行排序
        Arrays.sort(candidates);
        backtrack(res,new ArrayList<>(),candidates,target,0);
        return res;
    }
    private static void backtrack(List<List<Integer>> res,List<Integer> list,int[] candidates,int remain,int start){
        if(remain<0) return;
        else if(remain==0) res.add(new ArrayList<>(list));
        else {
            for(int i=start;i<candidates.length&&candidates[i]<=remain;i++){
                list.add(candidates[i]);
                backtrack(res,list,candidates,remain-candidates[i],i);
                list.remove(list.size()-1);
            }
        }
    }
}
