import java.util.ArrayList;
import java.util.List;

/*
@author lushuai
@date  2019/7/26-21:25
题目描述：给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
例如，给出 n = 3，生成结果为：
[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
*/
public class Leetcode22 {
    public static void main(String[] args) {

    }
    public List<String> generateParenthesis(int n){
        List<String> res = new ArrayList<>();
        backtrack("",res,n,n);
        return res;
    }
    public static void backtrack(String sublist,List<String> res,int left,int right){
        if(left==0&&right==0){
            res.add(sublist);
            return;
        }
        if(left>right)
            return;
        if(left>0)
            backtrack(sublist+"(",res,left-1,right);
        if(right>0)
            backtrack(sublist+")",res,left,right-1);
    }
}
