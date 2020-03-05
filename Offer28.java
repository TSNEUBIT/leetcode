/*
@author lushuai
@date  2020/2/19-16:51
题目描述：对称二叉树
*/
public class Offer28 {
    public static void main(String[] args) {

    }
    boolean isSymmetrical(Treenode pRoot){
        if(pRoot==null) return true;
        return judge(pRoot.left,pRoot.right);
    }
    //判断两个二叉树是不是对称的
    public boolean judge(Treenode node1,Treenode node2){
        if(node1==null&&node2==null) return true;
        else if(node1==null||node2==null) return false;
        else if(node1.val!=node2.val) return false;
        else {
            return judge(node1.left,node2.right)&&judge(node1.right,node2.left);
        }
    }


}
