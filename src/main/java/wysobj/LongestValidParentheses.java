package wysobj;

import java.util.LinkedList;

public class LongestValidParentheses
{
    public int longestValidParentheses(String s)
    {
        if (s == null || s.length() < 2)
        {
            return 0;
        }
        LinkedList<Character> stack = new LinkedList<Character>();
        int lastIdex = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char ci = s.charAt(i);
            if (ci == '(')
            {
                stack.addLast(ci);
            }
            else
            {
                if (stack.isEmpty() || stack.peek() != '(')
                {
                    lastIdex = i;
                    stack.clear();
                }
                else
                {
                    stack.removeLast();
                }
            }
        }
        stack.clear();

        int length = 0;
        for (int i = 0; i < lastIdex; i++)
        {
            char ci = s.charAt(i);
            if (ci == '(')
            {
                stack.addLast(ci);
            }
            else
            {
                if (stack.isEmpty() || stack.peek() != '(')
                {
                    length = 0;
                    stack.clear();
                }
                else
                {
                    stack.removeLast();
                    length += 2;
                    maxLength = length > maxLength ? length : maxLength;
                }
            }
        }

        stack.clear();
        length = 0;

        for (int i = s.length() - 1; i >= lastIdex; i--)
        {
            char ci = s.charAt(i);
            if (ci == ')')
            {
                stack.addLast(ci);
            }
            else
            {
                if (stack.isEmpty() || stack.peek() != ')')
                {
                    length = 0;
                    stack.clear();
                }
                else
                {
                    stack.removeLast();
                    length += 2;
                    maxLength = length > maxLength ? length : maxLength;
                }
            }
        }
        return maxLength;
    }
}
