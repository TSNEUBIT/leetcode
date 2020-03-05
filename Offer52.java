/*
@author lushuai
@date  2020/3/1-11:52
*/
public class Offer52 {
    public static void main(String[] args) {

    }
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2){
        int length1=GetListLength(pHead1);
        int length2=GetListLength(pHead2);
        int dif=length1-length2;

        ListNode longlist = pHead1;
        ListNode shortlist = pHead2;
        if (length2>length1){
           longlist=pHead2;
           shortlist=pHead1;
           dif=length2-length1;
        }

        for(int i=0;i<dif;i++){
            longlist=longlist.next;
        }

        while (longlist!=null&&shortlist!=null&&longlist!=shortlist){
            longlist=longlist.next;
            shortlist=shortlist.next;
        }
        ListNode FirstCommon=longlist;
        return FirstCommon;

    }
    int GetListLength(ListNode node){
            int length=0;
            while (node!=null){
                length++;
                node=node.next;
            }
            return length;
    }
}
