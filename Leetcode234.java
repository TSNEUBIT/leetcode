/*
@author lushuai
@date  2020/3/2-18:06
题目描述：判断是否是回文链表
可以用反转链表做基础
*/
public class Leetcode234 {
    public static void main(String[] args) {
        ListNode node1=new ListNode(0);
        ListNode node2=new ListNode(0);
        node1.next=node2;
        System.out.println(isPalindrome(node1));
    }
    public static boolean isPalindrome(ListNode head){
        if(head==null) return true;
        ListNode slow=head,fast=head;
        while (fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
        }
        slow = reverselist(slow);
        fast = head;

        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;

    }
   static ListNode reverselist(ListNode head){
        if(head==null) return null;
        ListNode pre=null;
        ListNode next=null;
        while (head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }

}
