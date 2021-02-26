package primary;

/**
 * 返回
 * 456. 引用
 * 描述
 * 实现一个类 ReferenceManager 包含如下两种方法
 *
 * 1.copyValue(Node obj) 只拷贝参数obj的权值，obj和node仍然是两个指针
 *
 * 2.copyReference(Node obj) obj和node指向同一个地方
 *
 * 您在真实的面试中是否遇到过这个题？
 * 样例
 * ReferenceManager ref = ReferenceManager();
 * Node obj = new Node(0);
 * ref.copyValue(obj);
 * ref.node.val; // 值为0
 * ref.node; // 与obj不同.
 *
 * Node obj2 = new Node(1);
 * ref.copyReference(obj2);
 * ref.node.val; // 值为1
 * ref.node; // 与 obj2相同，指向同一个地址
 */
public class Class456 {


    class Node {
        public int val;
        public Node(int val) {
            this.val = val;
        }
    }

    public Node node;

    public void copyValue(Node obj) {
        // copy value from obj to node
        node=new Node(obj.val);
    }

    public void copyReference(Node obj) {
        // copy reference from obj to node
        node=obj;
    }
}
