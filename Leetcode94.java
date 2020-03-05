import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
@author lushuai
@date  2019/7/1-15:45
二叉树的中序遍历（左根右）
两种方法：递归和迭代。
递归：写个函数，自己调用自己，比较简单。
迭代：用栈。
*/
public class Leetcode94 {
    public static void main(String[] args){

    }
    public List<Integer> inorderTraversal1(Treenode root){
        List<Integer> list = new ArrayList<>();

        Stack<Treenode> stack = new Stack<>();
        Treenode cur=root;
        while (cur!=null||!stack.empty())
        {
            while(cur!=null){
            stack.add(cur);
            cur=cur.left;
        }
        cur = stack.pop();
        list.add(cur.val);
        cur = cur.right;
    }
    return list;

}

    public List<Integer> inorderTraversal2(Treenode root){
        List<Integer> list = new ArrayList<>();
        inorderTraversal2(root,list);
        return list;
    }

    private void inorderTraversal2(Treenode treenode,List<Integer> list){
        if(treenode==null)
            return;
        inorderTraversal2(treenode.left,list);
        list.add(treenode.val);
        inorderTraversal2(treenode.right,list);

    }

}
