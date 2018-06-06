package wysobj;

import org.junit.Test;

public class UniqueBinarySearchTreeTest
{
    @Test
    public void testCase1()
    {
        int n = 3;
        UniqueBinarySearchTree ubst = new UniqueBinarySearchTree();
        int result = ubst.numTrees(n);
        assert (result == 5);
    }
}
