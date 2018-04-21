package wysobj.dataStructures;

public class ListNode<T>
{
    public T val;
    public ListNode<T> next;

    public ListNode() {}

    public ListNode(T element)
    {
        this.val = element;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(this.val);
        ListNode<T> p = next;
        while(p != null && p != this)
        {
            sb.append(" -> ");
            sb.append(p.val);
            p = p.next;
        }
        if (p == this)
        {
            sb.append(" -> ");
            sb.append("self");
        }
        return sb.toString();
    }
}
