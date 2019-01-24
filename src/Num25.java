/**
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
public class Num25 {
    public static RandomListNode Clone(RandomListNode pHead) {

        if (pHead == null){
            return null;
        }

        RandomListNode currentNode = pHead;
        //复制链表
        while(currentNode != null){
            RandomListNode cloneHead = new RandomListNode(currentNode.label);
            RandomListNode temp = currentNode.next;
            currentNode.next = cloneHead;
            cloneHead.next = temp;
            currentNode = temp;
        }
        //初始化复制的链表
        currentNode = pHead;
        while (currentNode != null){
            currentNode.next.random = currentNode.random == null ? null : currentNode.random.next;
            currentNode = currentNode.next.next;
        }

        //拆分链表
        currentNode = pHead;
        RandomListNode cloneHead = pHead.next;
        while(currentNode != null){
            RandomListNode cloneNode = currentNode.next;
            currentNode.next = cloneNode.next;
            cloneNode.next = cloneNode.next == null ? null : cloneNode.next.next;
            currentNode = currentNode.next;
        }

        return cloneHead;
    }

    public static void main(String[] args) {
        RandomListNode randomListNode1 = new RandomListNode(1);
        RandomListNode randomListNode2 = new RandomListNode(2);
        RandomListNode randomListNode3 = new RandomListNode(3);
        RandomListNode randomListNode4 = new RandomListNode(4);
        RandomListNode randomListNode5 = new RandomListNode(5);
        randomListNode1.next = randomListNode2;
        randomListNode2.next = randomListNode3;
        randomListNode3.next = randomListNode4;
        randomListNode4.next = randomListNode5;

        randomListNode2.random = randomListNode5;
        randomListNode1.random = randomListNode3;
        randomListNode4.random = randomListNode2;



        RandomListNode rn = Clone(randomListNode1);

//        RandomListNode rn = randomListNode1;

        while(rn != null){
            int current = rn.label;
            int next = 0;
            int random = 0;

            if (rn.next == null){
                next = 0;
            }else{
                next = rn.next.label;
            }

            if (rn.random == null){
                random = 0;
            }else{
                random = rn.random.label;
            }

            System.out.println(current + " : next " + next + " random " + random);
            rn = rn.next;
        }

    }

}

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
