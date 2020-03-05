/*
@author lushuai
@date  2019/7/8-16:33
对称二叉树：给定一个二叉树，检查他是否是镜像的
二叉树的本质是递归，递归的问题迭代都能解决
*/
public class Leetcode101 {
    public static void main(String[] args){

    }
    public boolean isSymmetric(Treenode root){
        if(root==null)
            return true;
        else
            return isSymmetrichelp(root.left,root.right);
    }
    public boolean isSymmetrichelp(Treenode left,Treenode right){
        if(left==null&&right==null)
            return true;
        else if(left==null||right==null)
            return false;
        else
            return left.val==right.val&&isSymmetrichelp(left.left,right.right)&&isSymmetrichelp(left.right,right.left);
    }
}
