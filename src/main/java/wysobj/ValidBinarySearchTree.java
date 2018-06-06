package wysobj;

import wysobj.dataStructures.TreeNode;

public class ValidBinarySearchTree
{
    private Integer lastVisitedValue = null;

    public boolean isValidBST(TreeNode root)
    {
        if (root == null)
        {
            return true;
        }
        boolean valid = true;
        if (root.left != null)
        {
            valid = valid && isValidBST(root.left);
        }
        if (valid)
        {
            valid = valid && (lastVisitedValue == null || root.val > lastVisitedValue);
            lastVisitedValue = root.val;
        }
        if (root.right != null)
        {
            valid = valid && isValidBST(root.right);
        }
        return valid;
    }
}
