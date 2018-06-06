package wysobj;

import wysobj.dataStructures.ListNode;

public class RemoveDuplicatesFromSortedList2
{
    public ListNode deleteDuplicates(ListNode head)
    {
        if (head == null || head.next == null)
        {
            return head;
        }
        ListNode sentinel = new ListNode(-1);
        sentinel.next = head;
        ListNode p1 = sentinel;
        ListNode p2 = head;
        ListNode p3 = head;
        while (p3 != null)
        {
            while (p3 != null && p2.val == p3.val)
            {
                p3 = p3.next;
            }
            if (p3 == p2.next)
            {
                p1.next = p2;
                p1 = p1.next;
            }
            if (p3 != null)
            {
                p2 = p3;
            }
        }
        p1.next = null;
        return sentinel.next;
    }
}
