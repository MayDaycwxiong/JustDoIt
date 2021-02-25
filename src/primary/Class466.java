package primary;

/**
 * 466. 链表节点计数
 * 计算链表中有多少个节点.
 *
 * 您在真实的面试中是否遇到过这个题？
 * 样例
 * 样例  1:
 * 	输入:  1->3->5->null
 * 	输出: 3
 *
 * 	样例解释:
 * 	返回链表中结点个数，也就是链表的长度.
 *
 * 样例 2:
 * 	输入:  null
 * 	输出: 0
 *
 * 	样例解释:
 * 	空链表长度为0
 */
public class Class466 {


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public int countNodes(ListNode head) {
        // write your code here
        int i=0;
        while(head!=null){
            i++;
            head=head.next;
        }
        return i;
    }
}
