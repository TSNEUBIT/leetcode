/*
@author lushuai
@date  2020/2/18-17:43
题目描述：
输入一个链表，输出该链表中倒数第k个结点
*/
public class Offer22 {
    public static void main(String[] args) {

    }
    public static ListNode FindKthToTail(ListNode head,int k){
        if(k==0) return null;
        if(head==null) return head;
        ListNode slow = head;
        ListNode fast = slow;
        for(int i=0;i<k-1;i++){
            fast=fast.next;
        }
        if(fast==null) return null;
        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}
