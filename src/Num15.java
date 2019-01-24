/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class Num15 {
    public static ListNode ReverseList(ListNode head) {

        if (head == null){
            return null;
        }

        ListNode pre = null;
        ListNode next = null;

        while (head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ReverseList(listNode1);

        printListNode(listNode3);

    }

    private static void printListNode(ListNode head) {
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }


}


