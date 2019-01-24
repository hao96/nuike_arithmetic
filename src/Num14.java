import java.util.List;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Num14 {

    public static ListNode FindKthToTail(ListNode head,int k) {
        if (head == null || k <= 0){
            return null;
        }
        ListNode first = head;
        ListNode end = head;

        for (int i = 0 ; i < k -1 ; i++){
            if (first.next != null){
                first = first.next;
            }else{
                return null;
            }
        }

        while (first.next != null){
            first = first.next;
            end = end.next;
        }
        return end;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        System.out.println(FindKthToTail(listNode1,5).val);

    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
