/*
@author lushuai
@date  2019/7/5-19:28
计算二叉树的直径，任意两个节点之间的最长距离
注意：两结点之间的路径长度是以它们之间边的数目表示。
开始想错了，以为是根节点的左子树的最大深度加根节点右子树的最大深度
试了一下，没有ac，如果根节点的左子树只有一个节点，而右子树的两个孩子都有很多子孙，那么这个直径就不会经过根节点，而是只在右子树一侧

后来还是用的递归的方法，有点复杂了，二叉树的本质是递归
*/
public class Leetcode543 {
    public static void main(String[] args){

    }
    public int diameterOfBinaryTree(Treenode root){
        if(root==null)
            return 0;
        int max=maxDepth(root.left)+maxDepth(root.right);//根节点不同，max不同
        int lmax=diameterOfBinaryTree(root.left);
        int rmax=diameterOfBinaryTree(root.right);
        return Math.max(max,Math.max(lmax,rmax));
    }
    public int maxDepth(Treenode root){
        if(root==null)
            return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
