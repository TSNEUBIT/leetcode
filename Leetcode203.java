/*
@author lushuai
@date  2019/5/27-14:57
反转单链表那道题没搞懂，先从简单的开始吧
除去链表中的指定元素
*/
public class Leetcode203 {
    public static void main(String[] args){

    }
    public static ListNode removeElements(ListNode head, int val){
        while (head.val==val&&head!=null)
            head=head.next;
        if(head==null)
            return head;
        ListNode p=head;
        while (p.next!=null)
        {
            if(p.next.val==val)
                p.next=p.next.next;
            else p=p.next;
        }
        return head;
    }
}
