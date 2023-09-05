package LeedCode;

import java.util.*;

public class _94 {
    public static void main(String[] args) {


    }

    static List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        travers(root, res);
        return res;

    }

    private static void travers(TreeNode root, List<Integer> res) {

        if (root == null) {
            return;
        }

        travers(root.left,res);
        res.add(root.left.val);

        travers(root.right, res);
        res.add(root.right.val);
    }

    static List<Integer> inorderTraversalStack(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr=curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }


    //      Definition for a binary tree node.
      class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }


}
