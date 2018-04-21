package wysobj;

import wysobj.dataStructures.ListNode;

public class SwapPairs
{
    public ListNode swapPairs(ListNode head)
    {
        ListNode hp = head;
        ListNode newHead = new ListNode();
        ListNode nhp = newHead;
        while (hp != null && hp.next != null)
        {
            nhp.next = hp.next;
            hp.next = hp.next.next;
            nhp.next.next = hp;
            nhp = hp;
            hp = nhp.next;
        }
        nhp.next = hp;
        return newHead.next;
    }
}
