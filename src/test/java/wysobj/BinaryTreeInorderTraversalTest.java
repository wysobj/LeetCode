package wysobj;

import org.junit.Test;
import wysobj.dataStructures.TreeNode;
import wysobj.util.TestUtil;

import java.util.Arrays;
import java.util.List;

public class BinaryTreeInorderTraversalTest
{
    @Test
    public void testCase1()
    {
        Integer[] nodes = new Integer[]{1, null, 2, 3};
        TreeNode root = TestUtil.generateTreeByInOrder(nodes);
        BinaryTreeInorderTraversal btit = new BinaryTreeInorderTraversal();
        List<Integer> result = btit.inorderTraversal(root);
        assert (result.equals(Arrays.asList(1, 3, 2)));
    }
}
