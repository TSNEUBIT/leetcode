/*
@author lushuai
@date  2019/5/27-15:47
一道很不错的题，可以尝试四种解法，暴力解法，分治算法，最小堆解法，优先队列算法，后边两种的算法的区别不是很清楚，这两天把这道题研究下
*/
public class Leetcode23 {
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


    //暴力解法
    public static ListNode mergeKLists1(ListNode[] lists){
        if(lists.length==0)
            return null;
        ListNode res=lists[0];

        for(int i=1;i<lists.length;i++)
        {
            res=mergeTwoLists(res,lists[i]);
        }
        return res;
    }

    //分治算法,模仿了归并排序的写法
    public static ListNode mergeKLists2(ListNode[] lists){
        mergeK(lists,0,lists.length-1);
        return lists[0];
    }
    static void mergeK(ListNode[] lists,int p,int r){
        if(p<r){
            int q=(p+r)/2;
            mergeK(lists,p,q);
            mergeK(lists,q+1,r);
            lists[p]=mergeTwoLists(lists[p],lists[q+1]);
        }
    }

}
