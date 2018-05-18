package wysobj;

import java.util.Arrays;
import java.util.LinkedList;

public class SimplifyPath
{
    public String simplifyPath(String path)
    {
        if (path == null)
        {
            return null;
        }
        LinkedList<String> stack = new LinkedList<String>();
        String[] segments = path.split("/");
        for (String s : segments)
        {
            if (s.length() == 0 || s.equals("."))
            {
                continue;
            }
            else if (s.equals(".."))
            {
                if (!stack.isEmpty())
                {
                    stack.removeLast();
                }
            }
            else
            {
                stack.addLast(s);
            }
        }
        StringBuilder simplified = new StringBuilder();
        while (!stack.isEmpty())
        {
            String s = stack.removeLast();
            simplified.insert(0, s);
            simplified.insert(0, '/');
        }
        if (simplified.length() == 0)
        {
            simplified.append('/');
        }
        return simplified.toString();
    }
}
