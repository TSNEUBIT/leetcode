/*
@author lushuai
@date  2019/5/27-10:18
周一早上刷的第一道题，不用焦虑，练好自己的内功
*/
public class Leetcode21 {
    public static void main(String[] args){

    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode mergehaed=new ListNode(0);
        if(l1.val<l2.val){
            mergehaed=l1;
            mergehaed.next=mergeTwoLists(l1.next,l2);
        }
        else {
            mergehaed=l2;
            mergehaed.next=mergeTwoLists(l1,l2.next);
        }
        return mergehaed;
    }
}
