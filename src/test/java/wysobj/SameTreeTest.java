package wysobj;

import org.junit.Test;
import wysobj.dataStructures.TreeNode;
import wysobj.util.TestUtil;

public class SameTreeTest
{
    @Test
    public void testCase1()
    {
        TreeNode p = TestUtil.generateTreeByHeap(new Integer[]{1, 2, 3});
        TreeNode q = TestUtil.generateTreeByHeap(new Integer[]{1, 2, 3});
        SameTree st = new SameTree();
        boolean result = st.isSameTree(p, q);
        assert (result == true);
    }

    @Test
    public void testCase2()
    {
        TreeNode p = TestUtil.generateTreeByHeap(new Integer[]{1, 2});
        TreeNode q = TestUtil.generateTreeByHeap(new Integer[]{1, null, 2});
        SameTree st = new SameTree();
        boolean result = st.isSameTree(p, q);
        assert (result == false);
    }

    @Test
    public void testCase3()
    {
        TreeNode p = TestUtil.generateTreeByHeap(new Integer[]{1, 2, 1});
        TreeNode q = TestUtil.generateTreeByHeap(new Integer[]{1, 1, 2});
        SameTree st = new SameTree();
        boolean result = st.isSameTree(p, q);
        assert (result == false);
    }
}
