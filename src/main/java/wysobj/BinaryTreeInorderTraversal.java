package wysobj;

import wysobj.dataStructures.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeInorderTraversal
{
    public List<Integer> inorderTraversal(TreeNode root)
    {
        List<Integer> result = new LinkedList<Integer>();
        if (root == null)
        {
            return result;
        }
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        pushLeftMost(root, stack);
        while (!stack.isEmpty())
        {
            TreeNode node = stack.removeLast();
            int val = node.val;
            result.add(val);
            if (node.right != null)
            {
                pushLeftMost(node.right, stack);
            }
        }
        return result;
    }

    private void pushLeftMost(TreeNode node, LinkedList<TreeNode> stack)
    {
        TreeNode p = node;
        while (p != null)
        {
            stack.addLast(p);
            p = p.left;
        }
    }
}
