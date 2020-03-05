/*
@author lushuai
@date  2019/7/4-16:09
二叉树的最大深度
递归：如果根节点为空，直接返回0；如果根节点非空，递归左右子树的深度，树的深度就是左右子树的深度加1
二叉树遍历的题目想到递归是很正常的，二叉树遍历的本质就是不断递归
*/
public class Leetcode104 {
    public static void main(String[] args){

    }
    public int maxDepth(Treenode root){
        if(root==null)
            return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
