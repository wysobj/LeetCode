package wysobj;

import org.junit.Test;
import wysobj.dataStructures.TreeNode;
import wysobj.util.TestUtil;

import java.util.List;

public class UniqueBinarySearchTree2Test
{
    @Test
    public void testCase1()
    {
        int n = 3;
        UniqueBinarySearchTree2 ubst2 = new UniqueBinarySearchTree2();
        List<TreeNode> result = ubst2.generateTrees(n);
        assert (result.size() == 5);
        assert (result.contains(TestUtil.generateTreeByInOrder(new Integer[]{1, null, 3, 2})));
        assert (result.contains(TestUtil.generateTreeByInOrder(new Integer[]{3, 2, 1})));
        assert (result.contains(TestUtil.generateTreeByInOrder(new Integer[]{3, 1, null, 2})));
        assert (result.contains(TestUtil.generateTreeByInOrder(new Integer[]{2, 1, null, null, 3})));
        assert (result.contains(TestUtil.generateTreeByInOrder(new Integer[]{1, null, 2, null, 3})));
    }
}
