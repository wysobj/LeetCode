package wysobj;

import java.util.*;

public class GroupAnagrams
{
    public List<List<String>> groupAnagrams(String[] strs)
    {
        List<List<String>> result = new LinkedList<List<String>>();
        if (strs == null || strs.length < 1)
        {
            return result;
        }
        Map<Letters, List<String>> lettersMap = new HashMap<Letters, List<String>>();
        for (String s : strs)
        {
            Letters letters = new Letters(s);
            if (!lettersMap.containsKey(letters))
            {
                lettersMap.put(letters, new LinkedList<String>());
            }
            lettersMap.get(letters).add(s);
        }
        for (Map.Entry<Letters, List<String>> entry : lettersMap.entrySet())
        {
            List<String> words = new LinkedList<String>(entry.getValue());
            result.add(words);
        }
        return result;
    }

    private static class Letters
    {
        int[] letters = new int[26];

        Letters(String s)
        {
            for (char c : s.toCharArray())
            {
                letters[c - 'a'] += 1;
            }
        }

        public int hashCode()
        {
            int hashCode = 0;
            for (int i = 0; i < this.letters.length; i++)
            {
                hashCode *= 2;
                hashCode += this.letters[i];
            }
            return hashCode;
        }

        @Override
        public boolean equals(Object o)
        {
            if (o == null || !(o instanceof Letters))
            {
                return false;
            }
            return isLettersSame((Letters) o);
        }

        private boolean isLettersSame(Letters o)
        {
            for (int i = 0; i < this.letters.length; i++)
            {
                if (this.letters[i] != o.letters[i])
                {
                    return false;
                }
            }
            return true;
        }
    }
}
