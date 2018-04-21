package wysobj;

import wysobj.dataStructures.ListNode;

import java.util.PriorityQueue;

public class MergeKSortedList
{
    public ListNode<Integer> mergeKLists(ListNode<Integer>[] lists)
    {
        if (lists == null)
        {
            return null;
        }
        ListNode[] heads = new ListNode[lists.length];
        ListNode<Integer> head = new ListNode<Integer>();
        ListNode<Integer> p = head;
        PriorityQueue<HeapNode> heap = new PriorityQueue<HeapNode>();
        for (int i = 0; i < lists.length; i++)
        {
            heads[i] = lists[i];
            HeapNode hn = makeHeapNode(lists[i], i);
            if (hn != null)
            {
                heap.add(hn);
            }
        }
        HeapNode heapTop;
        while ((heapTop = heap.poll()) != null)
        {
            int index = heapTop.index;
            p.next = lists[index];
            p = p.next;
            lists[index] = lists[index].next;
            HeapNode nextInserted = makeHeapNode(lists[index], index);
            if (nextInserted != null)
            {
                heap.add(nextInserted);
            }
        }
        return head.next;
    }

    private HeapNode makeHeapNode(ListNode<Integer> node, int index)
    {
        if (node == null)
        {
            return null;
        }
        HeapNode heapNode = new HeapNode(node.val, index);
        return heapNode;
    }

    private static class HeapNode implements Comparable<HeapNode>
    {
        private int val;
        private int index;

        HeapNode(int val, int index)
        {
            this.val = val;
            this.index = index;
        }

        public int compareTo(HeapNode o) {
            if (o == null)
            {
                return 1;
            }
            return this.val - o.val;
        }
    }
}
