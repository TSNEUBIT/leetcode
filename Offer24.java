/*
@author lushuai
@date  2020/3/2-17:39
*/
public class Offer24 {
    public static void main(String[] args) {

    }
    public static ListNode ReverseList(ListNode head){
        if(head==null) return null;
        ListNode pre=null;
        ListNode next=null;
        while (head!=null){
            //先用next保存head的下一个节点的信息，保证单链表不会因为失去head节点的原next节点而就此断裂
            next=head.next;
            //保存完next，就可以让head从指向next变成指向pre了
            head.next=pre;
            pre=head;
            head=next;
        }
        //head为空的时候，它前边的pre就是最后一个节点
        return pre;
    }

}