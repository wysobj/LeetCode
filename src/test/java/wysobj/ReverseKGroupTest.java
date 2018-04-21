package wysobj;

import wysobj.dataStructures.ListNode;
import org.junit.Test;

public class ReverseKGroupTest
{
    @Test
    public void testReverseKGroupCase1()
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
        int[] benchMarks = new int[]{2, 1, 0, 5, 4, 3};
        ReverseKGroup rkg = new ReverseKGroup();
        ListNode result = rkg.reverseKGroup(head.next, 3);
        int index = 0;
        while (result != null)
        {
            assert ((Integer)result.val == benchMarks[index++]);
            result = result.next;
        }
    }

    @Test
    public void testReverseKGroupCase2()
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
        int[] benchMarks = new int[]{2, 1, 0, 3, 4};
        ReverseKGroup rkg = new ReverseKGroup();
        ListNode result = rkg.reverseKGroup(head.next, 3);
        int index = 0;
        while (result != null)
        {
            assert ((Integer)result.val == benchMarks[index++]);
            result = result.next;
        }
    }

    @Test
    public void testReverseKGroupCase3()
    {
        ListNode head = new ListNode();
        SwapPairs sp = new SwapPairs();
        ListNode result = sp.swapPairs(head.next);
        assert (result == null);
    }
}
