/*
@author lushuai
@date  2019/5/25-16:15
*/
public class Leetcode876 {
    public static void main(String[] args){

    }
    public static ListNode middleNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
