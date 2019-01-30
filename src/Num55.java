import java.util.List;

/**
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 * 方法一：断链法
 * 方法二：跑圈法 2b = a
 */
public class Num55 {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if (pHead == null || pHead.next == null || pHead.next.next == null){
            return null;
        }
        ListNode fast = pHead.next.next;
        ListNode slow = pHead.next;
        while (fast != slow){
            if (fast.next.next != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }else{
                return null;
            }
        }

        fast = pHead;
        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {

    }
}
