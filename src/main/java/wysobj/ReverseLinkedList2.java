package wysobj;

import wysobj.dataStructures.ListNode;

public class ReverseLinkedList2
{
    public ListNode reverseBetween(ListNode head, int m, int n)
    {
        if (head == null)
        {
            return head;
        }
        ListNode sentinel = new ListNode(-1);
        ListNode tail = sentinel;
        int idx = 1;
        ListNode p = head;
        while (p != null)
        {
            ListNode tmp = p.next;
            p.next = tail.next;
            tail.next = p;
            if (idx >= m && idx <= n)
            {
                while (idx == n && tail.next != null)
                {
                    tail = tail.next;
                }
            }
            else
            {
                tail = p;
            }
            p = tmp;
            idx++;
        }
        return sentinel.next;
    }
}
