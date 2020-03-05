/*
@author lushuai
@date  2019/10/30-12:19
题目描述：N叉树的最大深度
*/
public class Leetcode559 {
    public static void main(String[] args) {

    }
    public static int maxDepth(Node root){
        if(root==null) return 0;
        int res=0;
        int dep=0;
        //这个for循环的写法值得积累
        for(Node child:root.children){
            dep=maxDepth(child);
            res=Math.max(res,dep);
        }
        return res+1;
    }

}
