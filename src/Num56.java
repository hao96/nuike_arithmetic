import java.util.List;

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class Num56 {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if (pHead == null){
            return null;
        }
        if (pHead != null && pHead.next == null){
            return pHead;
        }

        ListNode current;

        if (pHead.val == pHead.next.val){
            current = pHead.next.next;
            while (current != null && current.val == pHead.val){
                current = current.next;
            }
            return deleteDuplication(current);
        }else {
            current = pHead.next;
            pHead.next = deleteDuplication(current);
            return pHead;
        }
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(3);
        ListNode listNode5 = new ListNode(4);
        ListNode listNode6 = new ListNode(4);
        ListNode listNode7 = new ListNode(5);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;

        Num56 num56 = new Num56();
        ListNode head = num56.deleteDuplication(listNode1);
        while(head != null){
            System.out.println(head.val + " ");
            head = head.next;
        }
    }
}
