import java.util.ArrayList;
import java.util.List;

/*
@author lushuai
@date  2019/10/17-20:05
题目描述：找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
说明：

所有数字都是正整数。
解集不能包含重复的组合。
示例 1:

输入: k = 3, n = 7
输出: [[1,2,4]]
示例 2:

输入: k = 3, n = 9
输出: [[1,2,6], [1,3,5], [2,3,4]]
*/
public class Leetcode216 {
    public static void main(String[] args) {
        int k=3,n=9;
        System.out.println(combinationSum3(k,n));
    }
    public static List<List<Integer>> combinationSum3(int k, int n){
        List<List<Integer>> res = new ArrayList<>();//存放结果
        backtrack(res,new ArrayList<>(),n,k,1);
        return res;
    }
    private static void backtrack(List<List<Integer>> res,List<Integer> tem,int n,int k,int start){
        if(tem.size()>k) return;
        else if(tem.size()==k&&n==0){
            List<Integer> li = new ArrayList<>(tem);//因为tem后边还要变化，所以采用这种写法
            res.add(li);
            return;
        }
        for(int i=start;i<=9;i++){
            tem.add(i);
            backtrack(res,tem,n-i,k,i+1);
            tem.remove(tem.size()-1);
        }
    }
}
