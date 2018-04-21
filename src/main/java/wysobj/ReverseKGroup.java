package wysobj;

import wysobj.dataStructures.ListNode;
import java.util.LinkedList;

public class ReverseKGroup
{
    public ListNode reverseKGroup(ListNode node, int k)
    {
        ListNode hp = node;
        ListNode newHead = new ListNode();
        ListNode nhp = newHead;
        LinkedList<ListNode> stack = new LinkedList<ListNode>();
        while (hp != null)
        {
            stack.push(hp);
            hp = hp.next;
            if (stack.size() == k)
            {
                while (!stack.isEmpty())
                {
                    nhp.next = stack.pop();
                    nhp = nhp.next;
                }
            }
        }
        if (stack.size() < k)
        {
            while (!stack.isEmpty())
            {
                nhp.next = stack.removeLast();
                nhp = nhp.next;
            }
        }
        nhp.next = null;
        return newHead.next;
    }
}
