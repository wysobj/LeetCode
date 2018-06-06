package wysobj;

import org.junit.Test;
import wysobj.dataStructures.TreeNode;
import wysobj.util.TestUtil;

public class ValidBinarySearchTreeTest
{
    @Test
    public void testCase1()
    {
        TreeNode root = TestUtil.generateTreeByHeap(new Integer[]{2, 1, 3});
        ValidBinarySearchTree vbst = new ValidBinarySearchTree();
        boolean result = vbst.isValidBST(root);
        assert (result == true);
    }

    @Test
    public void testCase2()
    {
        TreeNode root = TestUtil.generateTreeByHeap(new Integer[]{5, 1, 4, null, null, 3, 6});
        ValidBinarySearchTree vbst = new ValidBinarySearchTree();
        boolean result = vbst.isValidBST(root);
        assert (result == false);
    }
}
