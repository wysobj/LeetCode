package wysobj;

import wysobj.dataStructures.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class UniqueBinarySearchTree2
{
    public List<TreeNode> generateTrees(int n)
    {
        List<TreeNode> result = new LinkedList<TreeNode>();
        if (n < 1)
        {
            return result;
        }
        return subroutine(n, 1);
    }

    private List<TreeNode> subroutine(int n, int x)
    {
        List<TreeNode> result = new LinkedList<TreeNode>();
        if (x == n)
        {
            TreeNode node = new TreeNode(x);
            result.add(node);
            return result;
        }
        for (int i = x; i <= n; i++)
        {
            List<TreeNode> leftChilds;
            List<TreeNode> rightChilds;
            if (i == x)
            {
                leftChilds = new LinkedList<TreeNode>();
                leftChilds.add(null);
                rightChilds = subroutine(n, i + 1);
            }
            else if (i == n)
            {
                leftChilds = subroutine(i - 1, x);
                rightChilds = new LinkedList<TreeNode>();
                rightChilds.add(null);
            }
            else
            {
                leftChilds = subroutine(i - 1, x);
                rightChilds = subroutine(n, i + 1);
            }
            for (TreeNode leftNode : leftChilds)
            {
                for (TreeNode rightNode : rightChilds)
                {
                    TreeNode node = new TreeNode(i);
                    node.left = leftNode;
                    node.right = rightNode;
                    result.add(node);
                }
            }
        }
        return result;
    }
}
