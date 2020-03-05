/*
@author lushuai
@date  2019/7/5-15:38
翻转二叉树，同样的，可以使用递归和迭代的方法
*/
public class Leetcode226 {
    public static void main(String[] args){

    }
    public Treenode invertTree(Treenode root){
        if(root==null)
            return null;
        Treenode node=invertTree(root.left);
        root.left=invertTree(root.right);
        root.right=node;
        return root;

    }
}
