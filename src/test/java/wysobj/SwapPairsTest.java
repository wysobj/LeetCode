package wysobj;

import wysobj.SwapPairs;
import wysobj.dataStructures.ListNode;
import org.junit.Test;

public class SwapPairsTest
{
    @Test
    public void testSwapPairsCase1()
    {
        ListNode head = new ListNode();
        ListNode p = head;
        for (int i = 0; i < 6; i++)
        {
            ListNode newNode = new ListNode();
            newNode.val = i;
            p.next = newNode;
            p = newNode;
        }
        int[] benchMarks = new int[]{1, 0, 3, 2, 5, 4};
        SwapPairs sp = new SwapPairs();
        ListNode result = sp.swapPairs(head.next);
        int index = 0;
        while (result != null)
        {
            assert ((Integer)result.val == benchMarks[index++]);
            result = result.next;
        }
    }

    @Test
    public void testSwapPairsCase2()
    {
        ListNode head = new ListNode();
        ListNode p = head;
        for (int i = 0; i < 5; i++)
        {
            ListNode newNode = new ListNode();
            newNode.val = i;
            p.next = newNode;
            p = newNode;
        }
        int[] benchMarks = new int[]{1, 0, 3, 2, 4};
        SwapPairs sp = new SwapPairs();
        ListNode result = sp.swapPairs(head.next);
        int index = 0;
        while (result != null)
        {
            assert ((Integer)result.val == benchMarks[index++]);
            result = result.next;
        }
    }

    @Test
    public void testSwapPairsCase3()
    {
        ListNode head = new ListNode();
        SwapPairs sp = new SwapPairs();
        ListNode result = sp.swapPairs(head.next);
        assert (result == null);
    }
}
