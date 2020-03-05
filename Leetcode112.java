/*
@author lushuai
@date  2019/10/20-22:17
题目描述：路径和
给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子结点的路径，这条路径上所有节点值相加等于目标和
*/
public class Leetcode112 {
    public static void main(String[] args) {

    }
    public static boolean hasPathSum(Treenode root, int sum){
        if(root==null) return false;
        if(root.left==null&&root.right==null&&sum-root.val==0) return true;
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }
}
