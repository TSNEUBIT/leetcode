import java.util.Arrays;

/*
@author lushuai
@date  2020/2/15-1:07
题目描述：已知前序遍历和中序遍历，重建二叉树
*/
public class Offer7 {
    public Treenode reConstructBinaryTree(int [] pre, int [] in){
        if(pre.length==0||in.length==0)
            return null;
        Treenode root = new Treenode(pre[0]);
        //在中序中找到前序的根
        for(int i=0;i<in.length;i++){
            if(in[i]==pre[0]){
                //左子树，函数左闭右开
                root.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                //右子树
                root.right=reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return root;
    }

}
