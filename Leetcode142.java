/*
@author lushuai
@date  2019/6/10-10:48
题目描述：给一个链表，如果有环，返回环起始的结点，如果没有环，返回空
tag：经典快慢指针加上一点数学推理
参考资料：https://blog.csdn.net/willduan1/article/details/50938210
*/
public class Leetcode142 {
    public static void main(String[] args){

    }
    public static ListNode detectCycle(ListNode head){
        if(head==null||head.next==null)
            return null;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){     //fast比slow走得快，只考虑fast的空指针异常即可
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                break;
            }
        }
        if( fast == null || fast.next == null ){
            return null;
        }
        fast=head;
        while (fast!=slow&&slow.next!=null){    //fast从头结点开始，所以fast肯定不会先出现空指针异常的问题，只考虑slow就可以
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
    }
}
