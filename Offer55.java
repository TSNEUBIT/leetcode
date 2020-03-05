

/*
@author lushuai
@date  2020/3/2-0:51
*/
public class Offer55 {
    public static void main(String[] args) {

    }
    public static int TreeDepth(Treenode root){
        if(root==null) return 0;
        return Math.max(TreeDepth(root.left),TreeDepth(root.right))+1;
    }
}
