package wysobj;

import java.util.LinkedList;
import java.util.List;

public class Combinations
{
    public List<List<Integer>> combine(int n, int k)
    {
        if (n < 1 || k < 1)
        {
            return new LinkedList<List<Integer>>();
        }
        List<Integer> bootstrapList = new LinkedList<Integer>();
        return combineSubroutine(n, k, 1, bootstrapList);
    }

    private List<List<Integer>> combineSubroutine(int n, int k, int cur, List<Integer> combination)
    {
        List<List<Integer>> results = new LinkedList<List<Integer>>();
        if (n - cur + 1 < k - combination.size())
        {
            return results;
        }
        if (combination.size() == k)
        {
            results.add(combination);
            return results;
        }
        List<Integer> combinationWithCur = new LinkedList<Integer>(combination);
        combinationWithCur.add(cur);
        results.addAll(combineSubroutine(n, k, cur+1, combinationWithCur));
        List<Integer> combinationWithoutCur = combination;
        results.addAll(combineSubroutine(n, k, cur + 1, combinationWithoutCur));
        return results;
    }
}
