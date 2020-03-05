/*
@author lushuai
@date  2019/5/25-18:16
妈的周六晚上约个人游泳约不到，再写两道题就撤
*/
public class Leetcode141 {
    public static void main(String[] args){

    }
    public static boolean hasCycle(ListNode head){
        if(head==null||head.next==null)
            return false;
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null&&slow!=null&&fast.next!=null&&fast.next.next!=null)//解决空指针异常
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }
}
