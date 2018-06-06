package wysobj.util;

import wysobj.dataStructures.ListNode;
import wysobj.dataStructures.TreeNode;

import java.util.List;

public class TestUtil
{
    public static <T> void assertArraySame(T[] arr1, T[] arr2)
    {
        if (arr1 == null)
        {
            assert (arr2 == null);
            return;
        }
        assert (arr1 != null && arr2 != null);
        assert (arr1.length == arr2.length);
        int length = arr1.length;
        for (int i = 0; i < length; i++)
        {
            if (arr1[i] == null)
            {
                assert (arr2[i] == null);
            }
            else
            {
                assert (arr1[i].equals(arr2[i]));
            }
        }
    }

    public static void assertArraySame(int[] arr1, int[] arr2)
    {
        if (arr1 == null)
        {
            assert (arr2 == null);
            return;
        }
        assert (arr1 != null && arr2 != null);
        assert (arr1.length == arr2.length);
        int length = arr1.length;
        for (int i = 0; i < length; i++)
        {
            assert (arr1[i] == arr2[i]);
        }
    }

    public static void assertListSame(ListNode l1, ListNode l2)
    {
        assert (l1 != null && l2 != null);
        while (l1 != null)
        {
            assert (l2 != null);
            assert (l1.val.equals(l2.val));
            l1 = l1.next;
            l2 = l2.next;
        }
    }

    public static void assertTreeSame(TreeNode root1, TreeNode root2)
    {
        if (root1 == null && root2 == null)
        {
            return;
        }
        assert (root1 != null && root2 != null);
        assertTreeSame(root1.left, root2.left);
        assert (root1.val == root2.val);
        assertTreeSame(root1.right, root2.right);
    }

    public static <T> ListNode<T> generateList(List<T> list)
    {
        ListNode<T> head = new ListNode<T>();
        ListNode<T> p = head;
        for (T obj : list)
        {
            ListNode<T> node = new ListNode<T>(obj);
            p.next = node;
            p = node;
        }
        return head.next;
    }

    public static TreeNode generateTreeByHeap(Integer[] vals)
    {
        if (vals == null || vals.length == 0 || vals[0] == null)
        {
            return null;
        }
        TreeNode[] nodes = new TreeNode[vals.length];
        for (int i = 0; i < vals.length; i++)
        {
            Integer val = vals[i];
            if (val == null)
            {
                continue;
            }
            TreeNode node = new TreeNode(val);
            if (i > 0)
            {
                if (i % 2 == 1)
                {
                    nodes[(i-1)/2].left = node;
                }
                else
                {
                    nodes[(i-1)/2].right = node;
                }
            }
            nodes[i] = node;
        }
        return nodes[0];
    }

    public static TreeNode generateTreeByInOrder(Integer[] vals)
    {
        if (vals == null || vals.length == 0 || vals[0] == null)
        {
            return null;
        }
        IndexHolder holder = new IndexHolder(0);
        TreeNode root = recursiveGenerateTree(vals, holder);
        return root;
    }

    private static TreeNode recursiveGenerateTree(Integer[] vals, IndexHolder holder)
    {
        int index = holder.getIndex();
        if (index >= vals.length)
        {
            return null;
        }
        Integer val = vals[index];
        holder.increase();
        if (val == null)
        {
            return null;
        }
        TreeNode node = new TreeNode(val);
        node.left = recursiveGenerateTree(vals, holder);
        node.right = recursiveGenerateTree(vals, holder);
        return node;
    }

    private static class IndexHolder
    {
        private int index;

        public IndexHolder(int index)
        {
            this.index = index;
        }

        public void increase()
        {
            ++this.index;
        }

        public int getIndex()
        {
            return this.index;
        }
    }
}
