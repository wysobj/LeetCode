package wysobj;

import org.junit.Test;
import wysobj.dataStructures.TreeNode;
import wysobj.util.TestUtil;

public class RecoverBinarySearchTreeTest
{
    @Test
    public void testCase1()
    {
        TreeNode original = TestUtil.generateTreeByHeap(new Integer[]{1, 3, null, null, 2});
        TreeNode correct = TestUtil.generateTreeByHeap(new Integer[]{3, 1, null, null, 2});
        RecoverBinarySearchTree rbst = new RecoverBinarySearchTree();
        rbst.recoverTree(original);
        TestUtil.assertTreeSame(original, correct);
    }

    @Test
    public void testCase2()
    {
        TreeNode original = TestUtil.generateTreeByHeap(new Integer[]{3, 1, 4, null, null, 2});
        TreeNode correct = TestUtil.generateTreeByHeap(new Integer[]{2, 1, 4, null, null, 3});
        RecoverBinarySearchTree rbst = new RecoverBinarySearchTree();
        rbst.recoverTree(original);
        TestUtil.assertTreeSame(original, correct);
    }
}
