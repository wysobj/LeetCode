package wysobj;

import wysobj.RemoveNthNodeFromEnd;
import wysobj.dataStructures.ListNode;
import org.junit.Before;
import org.junit.Test;

public class RemoveNthNodeFromEndTest
{
    private ListNode<Integer> head;
    private final int linkLength = 10;

    @Before
    public void setUp()
    {
        head = new ListNode<Integer>();
        ListNode<Integer> p = head;
        for (int i = 0; i < linkLength; i++)
        {
            ListNode<Integer> node = new ListNode<Integer>(i);
            p.next = node;
            p = node;
        }
    }

    @Test
    public void testValidCase()
    {
        int removed = 4;
        RemoveNthNodeFromEnd rnnfe = new RemoveNthNodeFromEnd();
        ListNode result = rnnfe.removeNthFromEnd(head.next, removed);
        ListNode<Integer> testNode = result;
        int length = 0;
        for (int i = 0; i < linkLength; i++)
        {
            if (i == linkLength - removed)
            {
                continue;
            }
            assert (testNode.val == i);
            testNode = testNode.next;
            length++;
        }
        assert (length == linkLength - 1);
    }

    @Test
    public void testNotLongEnoughCase()
    {
        int removed = 11;
        RemoveNthNodeFromEnd rnnfe = new RemoveNthNodeFromEnd();
        ListNode result = rnnfe.removeNthFromEnd(head.next, removed);
        ListNode<Integer> testNode = result;
        int length = 0;
        for (int i = 0; i < linkLength; i++)
        {
            assert (testNode.val == i);
            testNode = testNode.next;
            length++;
        }
        assert (length == linkLength);
    }

    @Test
    public void testNullCase()
    {
        RemoveNthNodeFromEnd rnnfe = new RemoveNthNodeFromEnd();
        ListNode result = rnnfe.removeNthFromEnd(null, 1);
        assert (result == null);
    }
}
