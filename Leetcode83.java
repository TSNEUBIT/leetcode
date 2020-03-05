/*
@author lushuai
@date  2019/5/25-16:42
*/
public class Leetcode83 {
    public static void main(String[] args){

    }
    public static ListNode deleteDuplicates(ListNode head){
        ListNode list=head;     //初始化
        while (list!=null)
        {
            if(list.next==null)
                break;
            if(list.val==list.next.val)
                list.next=list.next.next;
            else
                list=list.next;
        }
        return head;
    }
}
