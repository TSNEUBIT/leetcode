import java.util.ArrayList;
import java.util.Stack;

/*
@author lushuai
@date  2020/2/13-18:43
从尾到头打印链表
剑指里边导包还要自己写，太坑了吧
*/
public class Offer6 {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        Stack<Integer> stack = new Stack<>();//新建一个类型为链表的栈
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        while (!stack.isEmpty()){
            arrayList.add(stack.pop());
        }
        return arrayList;
    }
}
