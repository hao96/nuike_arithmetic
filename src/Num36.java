/**
 * 输入两个链表，找出它们的第一个公共结点。
 */
public class Num36 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int len1 = getLength(pHead1);
        int len2 = getLength(pHead2);

        if (len1 > len2){
            int count = len1 - len2;
            for (int i = 0 ; i < count ; i++){
                pHead1 = pHead1.next;
            }
        }

        if (len2 > len1){
            int count = len2 - len1;
            for (int i = 0 ; i < count ; i++){
                pHead2 = pHead2.next;
            }
        }

        while(pHead1 != null){
            if (pHead1.val == pHead2.val){
                return pHead1;
            }
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }

        return null;
    }

    private int getLength(ListNode pHead1) {
        int length = 0;
        while(pHead1 != null){
            length++;
            pHead1 = pHead1.next;
        }
        return length;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);

        listNode1.next = listNode2;
        listNode2.next = listNode3;

        Num36 num36 = new Num36();
        ListNode listNode = num36.FindFirstCommonNode(listNode1,listNode4);
        System.out.println(listNode);

    }

}
