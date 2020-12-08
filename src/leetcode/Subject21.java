package leetcode;

import leetcode.base.ListNode;

/**
 * 合并两个有序链表
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * @author vega
 */
public class Subject21 {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(),curr=head;
        while (l1!=null&&l2!=null){
            if (l1.val<l2.val){
                curr.next=l1;
                l1=l1.next;
            }else {
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }
        curr.next=l1==null?l2:l1;
        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode p=new ListNode(2);
        l1.next=p;
        p.next=new ListNode(4);
        ListNode l2=new ListNode(1);
        ListNode q=new ListNode(3);
        l2.next=q;
        q.next=new ListNode(4);
        ListNode l3=mergeTwoLists(l1,l2);
        while (l3!=null){
            System.out.println(l3.val);
            l3=l3.next;
        }
    }
}

