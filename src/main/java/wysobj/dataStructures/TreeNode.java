package wysobj.dataStructures;

import java.util.LinkedList;
import java.util.List;

public class TreeNode
{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode (int val)
    {
        this.val = val;
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == null || !(o instanceof TreeNode))
        {
            return false;
        }
        TreeNode other = (TreeNode) o;
        if (this.val != other.val)
        {
            return false;
        }
        boolean leftSame;
        if (this.left == null)
        {
            leftSame = other.left == null;
        }
        else
        {
            leftSame = this.left.equals(other.left);
        }
        boolean rightSame;
        if (this.right == null)
        {
            rightSame = other.right == null;
        }
        else
        {
            rightSame = this.right.equals(other.right);
        }
        return leftSame && rightSame;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        List<String> representation = recursiveTransform(this);
        for (String s : representation)
        {
            sb.append(s);
            sb.append("\n");
        }
        return sb.toString();
    }

    private static List<String> recursiveTransform(TreeNode node)
    {
        List<String> representation = new LinkedList<String>();
        if (node == null)
        {
            representation.add("null");
            return representation;
        }
        int val = node.val;
        int numberWidth = getNumberWidth(val);
        StringBuilder rightChildStub = new StringBuilder(String.format("%"+numberWidth+"d", node.val));
        StringBuilder leftChildStub = new StringBuilder();
        List<String> rightChildRepresentation = recursiveTransform(node.right);
        for (int i = 0; i < rightChildRepresentation.size(); i++)
        {
            String s = rightChildRepresentation.get(i);
            if (i == 0)
            {
                rightChildStub.append("__.__");
                rightChildStub.append(s);
                representation.add(rightChildStub.toString());
            }
            else
            {
                representation.add(String.format("%s|%s%s", blankOfNum(numberWidth+2), blankOfNum(2), s));
            }
        }
        List<String> leftChildRepresentation = recursiveTransform(node.left);
        for (int i = 0; i < leftChildRepresentation.size(); i++)
        {
            String s = leftChildRepresentation.get(i);
            if (i == 0)
            {
                leftChildStub.append(String.format("%s|__", blankOfNum(numberWidth+2)));
                leftChildStub.append(s);
                representation.add(leftChildStub.toString());
            }
            else
            {
                representation.add(String.format("%s%s", blankOfNum(numberWidth+5), s));
            }
        }
        return representation;
    }

    private static String blankOfNum(int num)
    {
        assert (num >= 0);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++)
        {
            sb.append(" ");
        }
        return sb.toString();
    }

    private static int getNumberWidth(int num)
    {
        if (num == 0)
        {
            return 1;
        }
        int width = num >= 0 ? 0 : 1;
        while (num != 0)
        {
            ++width;
            num /= 10;
        }
        return width;
    }
}
