package wysobj;

import java.util.*;

public class CombinationSum2
{
    public List<List<Integer>> combinationSum2(int[] candidates, int target)
    {
        Set<List<Integer>> result = new LinkedHashSet<List<Integer>>();
        if (candidates == null)
        {
            return new LinkedList<List<Integer>>(result);
        }
        Arrays.sort(candidates);
        for (int i = 0; i < candidates.length; i++)
        {
            List<List<Integer>> combinationsFromI = findCombinationStartFromIndex(candidates, target, i);
            if (!combinationsFromI.isEmpty())
            {
                result.addAll(combinationsFromI);
            }
        }

        return new LinkedList<List<Integer>>(result);
    }

    private List<List<Integer>> findCombinationStartFromIndex(int[] candidates, int target, int index)
    {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (index >= candidates.length || target < candidates[index])
        {
            return result;
        }
        int candidateAtIndex = candidates[index];
        if (candidateAtIndex == target)
        {
            List<Integer> combination = new LinkedList<Integer>();
            combination.add(candidateAtIndex);
            result.add(combination);
            return result;
        }
        for (int i = index + 1; i < candidates.length; i++)
        {
            List<List<Integer>> combinationsStartFromNext = findCombinationStartFromIndex(candidates, target - candidateAtIndex, i);
            for (List<Integer> combination : combinationsStartFromNext)
            {
                combination.add(0, candidateAtIndex);
                result.add(combination);
            }
        }
        return result;
    }
}
