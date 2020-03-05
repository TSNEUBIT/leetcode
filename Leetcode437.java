

/*
@author lushuai
@date  2019/10/20-23:11
*/
public class Leetcode437 {
    public static void main(String[] args) {

    }
    public int pathSum(Treenode root, int sum){
        if(root==null) return 0;
        return backtrack(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
    }
    public int backtrack(Treenode node,int sum){
        int res=0;
        if(node==null) return res;
        if(sum==node.val){
            res++;
        }
            res += pathSum(node.left, sum - node.val);
            res += pathSum(node.right, sum - node.val);
        return res;
    }
}
