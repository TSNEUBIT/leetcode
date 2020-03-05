
/*
@author lushuai
@date  2019/10/30-12:06
题目描述：检验是不是相同的二叉树
*/
public class Leetcode100 {
    public static void main(String[] args) {

    }
    public static boolean isSameTree(Treenode p, Treenode q){
        if(p==null&&q==null) return true;
        else if(p!=null&&q!=null){
            if(p.val!=q.val) return false;
            else {
                return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
            }
        }
        return false;
    }
}
