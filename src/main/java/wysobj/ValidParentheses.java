package wysobj;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class ValidParentheses
{
    public boolean isValid(String s)
    {
        if (s == null)
        {
            return false;
        }
        char[] chars = s.toCharArray();
        LinkedList<Character> stack = new LinkedList<Character>();
        for (char c : chars)
        {
            if (!isValidParentheseChar(c))
            {
                return false;
            }
            else if (isOpenParenthese(c))
            {
                stack.push(c);
            }
            else
            {
                if (stack.isEmpty() || !parenthesesMatch(stack.poll(), c))
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private Set<Character> validChars = new HashSet<Character>();

    {
        validChars.addAll(Arrays.asList('(', '[', '{', '}', ']', ')'));
    }

    private boolean isValidParentheseChar(char c)
    {
        return validChars.contains(c);
    }

    private boolean isOpenParenthese(char c)
    {
        return c == '(' || c == '[' || c == '{';
    }

    private boolean parenthesesMatch(char open, char close)
    {
        if (open == '(' && close == ')')
        {
            return true;
        }
        else if (open == '[' && close == ']')
        {
            return true;
        }
        else if (open == '{' && close == '}')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
