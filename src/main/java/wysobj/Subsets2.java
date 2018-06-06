package wysobj;

import java.util.*;

public class Subsets2
{
    // Using the idea of Cartesian product to avoid duplicate set.
    // Alternatively, using HashSet can also solve this problem.
    public List<List<Integer>> subsetsWithDup(int[] nums)
    {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (nums == null)
        {
            return result;
        }
        int[] copyOfNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copyOfNums);
        nums = copyOfNums;
        List<List<List<Integer>>> transformedNums = new LinkedList<List<List<Integer>>>();
        List<Integer> tmp = new LinkedList<Integer>();
        for (int i = 0; i <= nums.length; i++)
        {
            if (i < nums.length && (tmp.isEmpty() || nums[i] == tmp.get(0)))
            {
                tmp.add(nums[i]);
            }
            else
            {
                List<List<Integer>> dupElementSets = new LinkedList<List<Integer>>();
                for (int j = 0; j <= tmp.size(); j++)
                {
                    List<Integer> dupElementSet = new LinkedList<Integer>();
                    for (int k = 0; k < j; k++)
                    {
                        dupElementSet.add(tmp.get(k));
                    }
                    dupElementSets.add(dupElementSet);
                }
                transformedNums.add(dupElementSets);
                tmp.clear();
                if (i < nums.length)
                {
                    tmp.add(nums[i]);
                }
            }
        }
        result.add(new LinkedList<Integer>());
        return concate(transformedNums, 0, result);
    }

    private List<List<Integer>> concate(List<List<List<Integer>>> transformedNums, int idx, List<List<Integer>> prefix)
    {
        if (idx == transformedNums.size())
        {
            return prefix;
        }
        List<List<Integer>> setAtIdx = transformedNums.get(idx);
        List<List<Integer>> concatePrefixWithSetIdx = new LinkedList<List<Integer>>();
        for (int i = 0; i < prefix.size(); i++)
        {
            for (List<Integer> elementOfSetAtIdx : setAtIdx)
            {
                List<Integer> copy = new LinkedList<Integer>(prefix.get(i));
                copy.addAll(elementOfSetAtIdx);
                concatePrefixWithSetIdx.add(copy);
            }
        }
        return concate(transformedNums, idx + 1, concatePrefixWithSetIdx);
    }
}
