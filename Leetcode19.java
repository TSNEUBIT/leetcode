/*
@author lushuai
@date  2019/5/25-9:26
题目描述：一次循环删除未知长度链表的倒数第n个结点
快慢指针法
*/
public class Leetcode19 {
    public static void main(String[] args){
        ListNode list=new ListNode(0);
        list.val=1;
        list.next.val=2;
        list.next.next.val=3;
        list.next.next.next.val=4;
        list.next.next.next.next.val=5;
        if(list!=null){
        System.out.println(list);
        System.out.println(removeNthFromEnd(list,2));
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n){
        ListNode start=new ListNode(0);
        ListNode slow=start;
        ListNode fast=start;
        slow.next = head;
        for(int i=0;i<n+1;i++)
        {
            fast=fast.next;
        }

        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return start.next;
    }
}
