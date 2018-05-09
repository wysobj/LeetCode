package wysobj;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum
{
    public List<List<Integer>> combinationSum(int[] candidates, int target)
    {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (candidates == null || candidates.length == 0)
        {
            return result;
        }
        Arrays.sort(candidates);
        for (int i = 0; i < candidates.length; i++)
        {
            List<List<Integer>> combinationsStartFromI = findCombinationFromSubArray(candidates, target, i);
            result.addAll(combinationsStartFromI);
        }
        return result;
    }

    private List<List<Integer>> findCombinationFromSubArray(int[] candidates, int target, int startIndex)
    {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (startIndex >= candidates.length)
        {
            return result;
        }
        int candidate = candidates[startIndex];
        int repetition = 0;
        while (target >= candidate)
        {
            ++repetition;
            target = target - candidate;
            List<Integer> prefix = new LinkedList<Integer>();
            for (int i = 0; i < repetition; i++)
            {
                prefix.add(candidate);
            }
            if (target == 0)
            {
                result.add(prefix);
            }
            for (int i = startIndex + 1; i < candidates.length; i++)
            {
                List<List<Integer>> candidatesOfRemainTarget = findCombinationFromSubArray(candidates, target, i);
                for (List<Integer> crt : candidatesOfRemainTarget)
                {
                    List<Integer> validCombination = concatenateList(prefix, crt);
                    result.add(validCombination);
                }
            }

        }
        return result;
    }

    private List<Integer> concatenateList(List<Integer> prefix, List<Integer> appendix)
    {
        List<Integer> result = new LinkedList<Integer>();
        for (int ele : prefix)
        {
            result.add(ele);
        }
        for (int ele : appendix)
        {
            result.add(ele);
        }
        return result;
    }
}
