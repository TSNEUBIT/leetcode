import java.util.ArrayList;
import java.util.List;

/*
@author lushuai
@date  2019/10/20-22:35
题目描述：路径和。
给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
*/
public class Leetcode113 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> pathSum(Treenode root, int sum){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        backtrack(root,sum,cur,res);
        return res;
    }
    public void backtrack(Treenode root,int sum,List<Integer> cur,List<List<Integer>> res){
        if(root==null) return;
        cur.add(root.val);
        if(root.left==null&&root.right==null&&sum-root.val==0){
            //这里向结果集中加入符合条件的cur集合时注意要新建一个，不然集合中都是空的
            res.add(new ArrayList<>(cur));
        }
        else {
            backtrack(root.left,sum-root.val,cur,res);
            backtrack(root.right,sum-root.val,cur,res);
        }
        cur.remove(cur.size()-1);
    }
}
