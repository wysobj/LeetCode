package wysobj;

import wysobj.dataStructures.ListNode;

public class PartitionList
{
    public ListNode partition(ListNode head, int x)
    {
        if (head == null)
        {
            return head;
        }
        ListNode smallerHead = new ListNode(-1);
        ListNode greaterHead = new ListNode(-1);
        ListNode p = head;
        while (p != null)
        {
            int val = (Integer) p.val;
            head = p.next;
            if (val < x)
            {
                p.next = smallerHead.next;
                smallerHead.next = p;
            }
            else
            {
                p.next = greaterHead.next;
                greaterHead.next = p;
            }
            p = head;
        }
        ListNode sentinel = new ListNode(-1);
        ListNode pointer = greaterHead.next;
        while (pointer != null)
        {
            greaterHead.next = pointer.next;
            pointer.next = sentinel.next;
            sentinel.next = pointer;
            pointer = greaterHead.next;
        }
        pointer = smallerHead.next;
        while (pointer != null)
        {
            smallerHead.next = pointer.next;
            pointer.next = sentinel.next;
            sentinel.next = pointer;
            pointer = smallerHead.next;
        }
        return sentinel.next;
    }
}
