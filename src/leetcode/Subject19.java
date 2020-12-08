package leetcode;


import leetcode.base.ListNode;

/**
 * 删除链表的倒数第N个节点
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * @author vega
 */
public class Subject19 {

    /**
     * 快慢指针法
     *
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head, q = head;
        while (n > 0) {
            q = q.next;
            n--;
        }
        if (q == null) {
            return head.next;
        }
        while (q.next != null) {
            q = q.next;
            p = p.next;
        }
        p.next = p.next.next;

        return head;
    }

    /**
     * 递归计数法
     *
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd1(ListNode head, int n) {
        return removeNode(head, n) == n ? head.next : head;
    }

    public static int removeNode(ListNode node, int n) {
        if (node.next == null) {
            return 1;
        }
        int m = removeNode(node.next, n);
        if (m == n) {
            if (m == 1) {
                node.next = null;
            } else {
                node.next = node.next.next;
            }
        }
        return m + 1;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        head = removeNthFromEnd(head, 5);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
