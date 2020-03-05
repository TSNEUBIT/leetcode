import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
@author lushuai
@date  2019/7/10-17:32
锯齿形遍历二叉树
*/
public class Leetcode103 {
    public static void main(String[] args){

    }
    public List<List<Integer>> zigzagLevelOrder(Treenode root){
        Treenode node=root;
        List<List<Integer>> res = new ArrayList<>();
        Stack<Treenode> s1 = new Stack<>();
        Stack<Treenode> s2 = new Stack<>();

        if(root==null)
            return res;
        s1.push(root);
        while(!s1.empty()||!s2.empty())
        {
            List<Integer> tem = new ArrayList<>();
            while (!s1.empty())
            {
                node=s1.pop();
                tem.add(node.val);
                if(node.left!=null)
                    s2.push(node.left);
                if(node.right!=null)
                    s2.push(node.right);
            }
            res.add(tem);
            tem=new ArrayList<Integer>();
            //tem.clear();
            while (!s2.empty())
            {
                node=s2.pop();
                tem.add(node.val);
                if(node.right!=null)
                    s1.push(node.right);
                if(node.left!=null)
                    s1.push(node.left);
            }
            //res.add(tem);
            if(!tem.isEmpty())
                res.add(tem);
        }
        return res;
    }
}
