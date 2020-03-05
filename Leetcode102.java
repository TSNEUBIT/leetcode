import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
@author lushuai
@date  2019/7/10-11:41
二叉树的层序遍历：层序遍历就是广度优先遍历，BFS，用队列的数据结构
*/
public class Leetcode102 {
    public static void main(String[] args){

    }
    public List<List<Integer>> levelOrder(Treenode root){
        Queue<Treenode> queue = new LinkedList<>();         //新建一个队列
        List<List<Integer>> wraplist = new LinkedList<>();  //返回结果

        if(root==null)
            return wraplist;        //树为空直接返回
        queue.offer(root);          //根节点进入队列
        while (!queue.isEmpty())
        {
            int levelNum = queue.size();
            List<Integer> sublist = new LinkedList<>(); //存储二叉树的每一层
            for(int i=0;i<levelNum;i++)
            {
                if(queue.peek().left!=null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right!=null)
                    queue.offer(queue.peek().right);
                sublist.add(queue.peek().val);
            }
            wraplist.add(sublist);

        }
        return wraplist;

    }
}
