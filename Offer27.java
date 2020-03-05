
/*
@author lushuai
@date  2020/2/19-15:44
题目描述：二叉树的镜像

*/
public class Offer27 {
    public static void main(String[] args) {

    }
    public static void Mirror(Treenode root){
        if(root==null) return;
        Treenode tem = null;
        tem=root.left;
        root.left=root.right;
        root.right=tem;
        Mirror(root.left);
        Mirror(root.right);
    }
}
