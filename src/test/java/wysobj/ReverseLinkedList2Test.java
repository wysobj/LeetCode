package wysobj;

import org.junit.Test;
import wysobj.dataStructures.ListNode;
import wysobj.util.TestUtil;

import java.util.Arrays;

public class ReverseLinkedList2Test
{
    @Test
    public void testCase1()
    {
        ListNode head = TestUtil.generateList(Arrays.asList(1, 2, 3, 4, 5));
        int m = 2;
        int n = 4;
        ListNode benchMark = TestUtil.generateList(Arrays.asList(1, 4, 3, 2, 5));
        ReverseLinkedList2 rl2 = new ReverseLinkedList2();
        ListNode result = rl2.reverseBetween(head, m, n);
        TestUtil.assertListSame(result, benchMark);
    }

    @Test
    public void testCase2()
    {
        ListNode head = TestUtil.generateList(Arrays.asList(1, 2, 3, 4, 5));
        int m = 2;
        int n = 2;
        ListNode benchMark = TestUtil.generateList(Arrays.asList(1, 2, 3, 4, 5));
        ReverseLinkedList2 rl2 = new ReverseLinkedList2();
        ListNode result = rl2.reverseBetween(head, m, n);
        TestUtil.assertListSame(result, benchMark);
    }

    @Test
    public void testCase3()
    {
        ListNode head = TestUtil.generateList(Arrays.asList(1));
        int m = 1;
        int n = 1;
        ListNode benchMark = TestUtil.generateList(Arrays.asList(1));
        ReverseLinkedList2 rl2 = new ReverseLinkedList2();
        ListNode result = rl2.reverseBetween(head, m, n);
        TestUtil.assertListSame(result, benchMark);
    }
}
