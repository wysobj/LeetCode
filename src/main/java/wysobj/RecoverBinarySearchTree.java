package wysobj;

import wysobj.dataStructures.TreeNode;

public class RecoverBinarySearchTree
{
    private Integer previousVisitedVal = null;
    private TreeNode previousVisitedNode = null;
    private TreeNode smallerNode = null;
    private TreeNode greaterNode = null;
    public void recoverTree(TreeNode root)
    {
        subroutine(root);
        if (smallerNode != null && greaterNode != null)
        {
            int tmp = smallerNode.val;
            smallerNode.val = greaterNode.val;
            greaterNode.val = tmp;
        }
    }

    private void subroutine(TreeNode root)
    {
        if (root == null)
        {
            return;
        }
        subroutine(root.left);
        if (previousVisitedVal != null)
        {
            if (root.val < previousVisitedVal)
            {
                if (greaterNode == null)
                {
                    greaterNode = previousVisitedNode;
                    smallerNode = root;
                }
                else
                {
                    smallerNode = root;
                }
            }
        }
        previousVisitedVal = root.val;
        previousVisitedNode = root;
        subroutine(root.right);
    }
}
