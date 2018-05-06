package wysobj;

import wysobj.dataStructures.ListNode;

import java.util.LinkedList;

public class RotateList
{
    public ListNode rotateRight(ListNode head, int k)
    {
        if (head == null)
        {
            return head;
        }
        int listLength = getListLength(head);
        int acutalMove = k % listLength;
        ListNode sentinel = new ListNode(-1);
        sentinel.next = head;
        ListNode p = sentinel;
        for (int i = 0; i < listLength - acutalMove; i++)
        {
            p = p.next;
        }
        ListNode tail = p;
        while (tail.next != null)
        {
            tail = tail.next;
        }
        tail.next = head;
        sentinel.next = p.next;
        p.next = null;
        return sentinel.next;
    }

    private int getListLength(ListNode head)
    {
        int length = 0;
        while (head != null)
        {
            ++length;
            head = head.next;
        }
        return length;
    }
}
