package wysobj;

import wysobj.dataStructures.ListNode;

public class MergeTwoSortedList
{
    public ListNode mergeTwoLists(ListNode<Integer> l1, ListNode<Integer> l2)
    {
        ListNode<Integer> head = new ListNode<Integer>();
        ListNode<Integer> p = head;
        while (l1 != null && l2 != null)
        {
            if (l1.val < l2.val)
            {
                p.next = l1;
                l1 = l1.next;
                p = p.next;
            }
            else
            {
                p.next = l2;
                l2 = l2.next;
                p = p.next;
            }
        }
        if (l1 != null)
        {
            p.next = l1;
        }
        else if (l2 != null)
        {
            p.next = l2;
        }
        return head.next;
    }
}
