/*
@author lushuai
@date  2019/5/28-16:48
晚上去游泳
题目描述：两两交换链表中的节点
两种方法：迭代和递归
迭代：为了不单独讨论头节点，使用一个空节点指向头结点，再让指针便利链表
*/
public class Leetcode24 {
    public static void main(String[] args){

    }

    public static ListNode swapPairs(ListNode head){
        //如果链表为空或只有一个元素
        if(head==null||head.next==null)
            return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;        //新建一个节点指向头结点
        ListNode point=dummy;
        while (point!=null&&point.next!=null&&point.next.next!=null)//防止出现空指针异常的错误
        {
            ListNode swap1=point.next;
            ListNode swap2=point.next.next;
            point.next=swap2;
            swap1.next=swap2.next;
            swap2.next=swap1;
            point=swap1;        //point指向下两个需要交换的节点
        }
        return dummy.next;      //注意返回值

    }
}
