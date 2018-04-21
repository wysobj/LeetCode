package wysobj;

import wysobj.dataStructures.ListNode;

public class RemoveNthNodeFromEnd
{
    /**
     * Remove node in one pass
     */
    public ListNode removeNthFromEnd(ListNode list, int n)
    {
        ListNode head = new ListNode();
        head.next = list;
        ListNode prev = head;
        ListNode after = head;
        for (int i = 0; i < n; i++)
        {
            if (after.next == null && i < n)
            {
                return head.next;
            }
            after = after.next;
        }
        while (after.next != null)
        {
            prev = prev.next;
            after = after.next;
        }
        prev.next = prev.next.next;
        return head.next;
    }
}
