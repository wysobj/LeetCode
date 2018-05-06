package wysobj;

import org.junit.Test;
import wysobj.dataStructures.ListNode;

public class RotateListTest
{
    @Test
    public void testCase1()
    {
        ListNode head = generateList(5, 1);
        int k = 2;
        RotateList rl = new RotateList();
        ListNode result = rl.rotateRight(head, k);
        int[] benchMark = new int[]{4, 5, 1, 2, 3};
        for (int i = 0; i < benchMark.length; i++)
        {
            assert (((Integer)result.val) == benchMark[i]);
            result = result.next;
        }
    }

    @Test
    public void testCase2()
    {
        ListNode head = generateList(3, 0);
        int k = 4;
        RotateList rl = new RotateList();
        ListNode result = rl.rotateRight(head, k);
        int[] benchMark = new int[]{2, 0, 1};
        for (int i = 0; i < benchMark.length; i++)
        {
            assert (((Integer)result.val) == benchMark[i]);
            result = result.next;
        }
    }

    private ListNode generateList(int n, int start)
    {
        ListNode head = new ListNode(-1);
        ListNode tail = head;
        for (int i = 0; i < n; i++)
        {
            ListNode newNode = new ListNode(start + i);
            tail.next = newNode;
            tail = newNode;
        }
        return head.next;
    }
}
