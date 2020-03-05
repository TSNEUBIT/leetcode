import java.util.Scanner;

/*
@author lushuai
@date  2020/2/14-23:41
小红书题目：
题目描述：
给出一个链表，每k个节点一组进行翻转，并返回翻转后的链表。
k是一个正整数，它的值小于或等于链表的长度。
如果节点总数不是 k 的整数倍，那么将最后剩余节点保持原有顺序。

说明：
1. 你需要自行定义链表结构，将输入的数据保存到你的链表中；
2. 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换；
3. 你的算法只能使用常数的额外空间。
*/
public class Main1 {
    //定义Node节点
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){ val=x; }
    }

    public static void main(String[] args) {
        //获取输入信息
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int k = scanner.nextInt();
        String[] strings = string.split("");
        //创建头节点
        ListNode head = new ListNode(0);
    }
}
