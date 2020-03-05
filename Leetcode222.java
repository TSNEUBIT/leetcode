/*
@author lushuai
@date  2019/10/30-11:30
题目描述：给出一个完全二叉树，求出该树的节点个数。
*/
public class Leetcode222 {
    public static void main(String[] args) {

    }
    public static int countNodes(Treenode root){
        if(root==null) return 0;
        return countNodes(root.left)+countNodes(root.right)+1;
    }
}
