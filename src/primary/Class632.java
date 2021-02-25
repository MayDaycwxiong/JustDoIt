package primary;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 描述
 * 在二叉树中寻找值最大的节点并返回。
 * 样例
 * 样例1:
 *
 * 输入:
 * {1,-5,3,1,2,-4,-5}
 * 输出: 3
 * 说明:
 * 这棵树如下所示：
 *      1
 *    /   \
 *  -5     3
 *  / \   /  \
 * 1   2 -4  -5
 */
public class Class632 {


     public static class TreeNode {
         public int val;
         public TreeNode left, right;
          public TreeNode(int val) {
              this.val = val;
              this.left = this.right = null;
          }
      }

    public static void main(String[] args) {
        TreeNode treeNode1=new TreeNode(1);
        TreeNode treeNode2=new TreeNode(-5);
        TreeNode treeNode3=new TreeNode(1);
        TreeNode treeNode4=new TreeNode(2);
        TreeNode treeNode5=new TreeNode(3);
        TreeNode treeNode6=new TreeNode(-4);
        TreeNode treeNode7=new TreeNode(-5);

        treeNode1.left=treeNode2;
        treeNode1.right=treeNode5;

        treeNode2.left=treeNode3;
        treeNode2.right=treeNode4;

        treeNode5.left=treeNode6;
        treeNode5.right=treeNode7;

        new Solution().maxNode(treeNode1);
    }

    public static class Solution {
        /*
         * @param root: the root of tree
         * @return: the max node
         */


        public TreeNode maxNode(TreeNode root) {
            // write your code here
            if(root==null){
                return root;
            }
            Stack<TreeNode> stack=new Stack<>();

            List<TreeNode> targetNode=new ArrayList<>();
            targetNode.add(root);
            // 遇到左节点入栈
            this.pushStack(stack,root,targetNode);
            // 出栈
            this.popStack(stack,targetNode);
            return targetNode.get(0);
        }

        private void popStack(Stack<TreeNode> stack, List<TreeNode> targetNode) {
            TreeNode currentNode=null;
            while(stack.size()>0){
                TreeNode popNode=stack.pop();
                if(popNode.right!=null){
                    currentNode=popNode.right;
                    pushStack(stack,currentNode,targetNode);
                }
            }
        }

        public void pushStack(Stack<TreeNode> stack, TreeNode currentNode, List<TreeNode> targetNode){
            stack.push(currentNode);

            if(targetNode.get(0).val<currentNode.val){
                targetNode.remove(0);
                targetNode.add(currentNode);
            }
            while(currentNode.left!=null){
                currentNode=currentNode.left;
                stack.push(currentNode);
                if(targetNode.get(0).val<currentNode.val){
                    targetNode.remove(0);
                    targetNode.add(currentNode);
                }
            }
        }
    }
}
