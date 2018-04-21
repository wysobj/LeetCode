package wysobj;

import wysobj.MergeTwoSortedList;
import wysobj.dataStructures.ListNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedListTest
{
    @Test
    public void testMergeDualList()
    {
        ListNode<Integer> l1 = makeList(Arrays.asList(1, 3, 5, 7));
        ListNode<Integer> l2 = makeList(Arrays.asList(2, 4, 6, 8));
        MergeTwoSortedList mtsl = new MergeTwoSortedList();
        ListNode<Integer> result = mtsl.mergeTwoLists(l1, l2);
        int length = 0;
        int[] benchMark = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        while (result != null)
        {
            assert (result.val == benchMark[length]);
            result = result.next;
            length++;
        }
        assert (length == benchMark.length);
    }

    @Test
    public void testMergeListAndNull()
    {
        ListNode<Integer> l1 = makeList(Arrays.asList(1, 3, 5, 7));
        ListNode<Integer> l2 = null;
        MergeTwoSortedList mtsl = new MergeTwoSortedList();
        ListNode<Integer> result = mtsl.mergeTwoLists(l1, l2);
        int length = 0;
        int[] benchMark = new int[]{1, 3, 5, 7};
        while (result != null)
        {
            assert (result.val == benchMark[length]);
            result = result.next;
            length++;
        }
        assert (length == benchMark.length);
    }

    @Test
    public void testMergeNullAndNull()
    {
        ListNode<Integer> l1 = null;
        ListNode<Integer> l2 = null;
        MergeTwoSortedList mtsl = new MergeTwoSortedList();
        ListNode<Integer> result = mtsl.mergeTwoLists(l1, l2);
        assert (result == null);
    }

    private ListNode<Integer> makeList(List<Integer> list)
    {
        ListNode<Integer> head = new ListNode<Integer>();
        ListNode<Integer> p = head;
        for (int element : list)
        {
            ListNode<Integer> node = new ListNode<Integer>();
            node.val = element;
            p.next = node;
            p = node;
        }
        return head.next;
    }
}
