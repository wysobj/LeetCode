package wysobj;

import java.util.*;

public class GenerateParenthesis
{
    private Map<Integer, List<String>> cachedResults = new HashMap<Integer, List<String>>();

    {
        cachedResults.put(0, Arrays.asList(""));
        cachedResults.put(1, Arrays.asList("()"));
    }

    public List<String> generateParenthesis(int n)
    {
        Set<String> result = new HashSet<String>();
        for (int i = 0; i < n; i++)
        {
            StringBuilder leftSb = new StringBuilder();
            StringBuilder rightSb = new StringBuilder();
            for (int k = 0; k < i; k++)
            {
                leftSb.append("(");
                rightSb.append(")");
            }
            for (int j = 1; j < n - i; j++)
            {
                List<String> leftParenthesis = getNthParenthesisResult(j);
                List<String> rightParenthesis = getNthParenthesisResult(n - i - j);
                for (String lp : leftParenthesis)
                {
                    for (String rp : rightParenthesis)
                    {
                        StringBuilder sb = new StringBuilder();
                        sb.append(leftSb.toString());
                        sb.append(lp);
                        sb.append(rp);
                        sb.append(rightSb.toString());
                        result.add(sb.toString());
                    }
                }
            }
        }
        StringBuilder addition = new StringBuilder();
        for (int i = 0; i < n; i++)
        {
            addition.insert(0, "(");
            addition.append(")");
        }
        result.add(addition.toString());
        return new LinkedList<String>(result);
    }


    private List<String> getNthParenthesisResult(int n)
    {
        if (!cachedResults.containsKey(n))
        {
            cachedResults.put(n, generateParenthesis(n));
        }
        return cachedResults.get(n);
    }
}
