package primary;

import java.util.ArrayList;
import java.util.List;

/**
 * 483. 链表转数组
 * 将一个链表转换为一个数组。
 * <p>
 * 您在真实的面试中是否遇到过这个题？
 * 样例
 * 样例 1:
 * <p>
 * 输入: 1->2->3->null
 * 输出: [1,2,3]
 */
public class Class483 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public List<Integer> toArrayList(ListNode head) {
        // write your code here
        List<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        return list;
    }
}
