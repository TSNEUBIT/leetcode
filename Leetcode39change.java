import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
@author lushuai
@date  2019/10/17-15:06
*/
public class Leetcode39change {
    public static void main(String[] args) {
        int[] nums={2,3,5,8};
        int target=8;
        System.out.println(combinationSum(nums,8));
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
            for(int i=start;i<candidates.length;i++){
                if(candidates[i]==candidates[i-1]&&i>start) continue;
                list.add(candidates[i]);
                backtrack(res,list,candidates,remain-candidates[i],i+1);
                list.remove(list.size()-1);
            }
        }
    }
}
