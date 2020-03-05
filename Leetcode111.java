/*
@author lushuai
@date  2019/7/4-16:37
*/
public class Leetcode111 {
    public static void main(String[] args){

    }
    public int minDepth(Treenode root){
        if(root==null)
            return 0;
        if(root.left!=null&&root.right!=null)
            return Math.min(minDepth(root.left),minDepth(root.right))+1;
        else
            return Math.max(minDepth(root.left),minDepth(root.right))+1;
    }
}
