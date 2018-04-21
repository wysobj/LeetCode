package wysobj;

import wysobj.dataStructures.ListNode;
import org.junit.Test;

public class MergeKSortedListTest
{
    @Test
    public void testMergeKListCase1()
    {
        ListNode[] lists = new ListNode[5];
        for (int i = 14; i >= 0; i--)
        {
            ListNode node = new ListNode();
            node.val = i;
            int index = i % lists.length;
            node.next = lists[index];
            lists[index] = node;
        }
        MergeKSortedList mksl = new MergeKSortedList();
        ListNode result = mksl.mergeKLists(lists);
        ListNode p = result;
        int[] benchValues = new int[]{0, 1, 2, 3, 4, 5,
                                        6, 7, 8, 9, 10,
                                        11, 12, 13, 14};
        int index = 0;
        while (p != null)
        {
            assert ((Integer)p.val == benchValues[index]);
            p = p.next;
            index++;
        }
    }

    @Test
    public void testMergeKListCase2()
    {
        ListNode[] lists = new ListNode[5];
        for (int i = 14; i >= 0; i--)
        {
            ListNode node = new ListNode();
            node.val = i;
            int index = i % lists.length;
            node.next = lists[index];
            lists[index] = node;
        }
        lists[0] = null;
        MergeKSortedList mksl = new MergeKSortedList();
        ListNode result = mksl.mergeKLists(lists);
        ListNode p = result;
        int[] benchValues = new int[]{1, 2, 3, 4,
                                    6, 7, 8, 9,
                                    11, 12, 13, 14};
        int index = 0;
        while (p != null)
        {
            assert ((Integer)p.val == benchValues[index]);
            p = p.next;
            index++;
        }
    }

    @Test
    public void testMergeKListCase3()
    {
        ListNode[] lists = new ListNode[5];
        for (int i = 14; i >= 0; i--)
        {
            ListNode node = new ListNode();
            node.val = i / lists.length;
            int index = i % lists.length;
            node.next = lists[index];
            lists[index] = node;
        }
        MergeKSortedList mksl = new MergeKSortedList();
        ListNode result = mksl.mergeKLists(lists);
        ListNode p = result;
        int[] benchValues = new int[]{0, 0, 0, 0, 0,
                                      1, 1, 1, 1, 1,
                                      2, 2, 2, 2, 2};
        int index = 0;
        while (p != null)
        {
            assert ((Integer)p.val == benchValues[index]);
            p = p.next;
            index++;
        }
    }

    @Test
    public void testMergeKListCase4()
    {
        ListNode[] lists = new ListNode[5];
        MergeKSortedList mksl = new MergeKSortedList();
        ListNode result = mksl.mergeKLists(lists);
        assert (result == null);
    }

    @Test
    public void testMergeKListCase5()
    {
        ListNode[] lists = null;
        MergeKSortedList mksl = new MergeKSortedList();
        ListNode result = mksl.mergeKLists(lists);
        assert (result == null);
    }
}
