package wysobj;

import wysobj.dataStructures.TreeNode;

public class SameTree
{
    public boolean isSameTree(TreeNode p, TreeNode q)
    {
        if (p == null || q == null)
        {
            return p == null && q == null;
        }
        boolean same = true;
        same = same && isSameTree(p.left, q.left);
        same = same && (p.val == q.val);
        same = same && isSameTree(p.right, q.right);
        return same;
    }
}
