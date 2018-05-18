package wysobj;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinimumWindowSubstring
{
    public String minWindow(String s, String t)
    {
        // do not handle null case, just let exception throw.
        if (s.length() == 0 || t.length() == 0)
        {
            return "";
        }
        String result = "";
        int begin = 0;
        int end = 0;
        StringMatchRecorder strMatchRecorder = new StringMatchRecorder(t);
        while (end < s.length())
        {
            if (!strMatchRecorder.isAlreadyMatch())
            {
                char nextChar = s.charAt(end);
                strMatchRecorder.increaseChar(nextChar);
                ++end;
            }
            while (strMatchRecorder.isAlreadyMatch())
            {
                int length = end - begin;
                if (result.equals("") || length < result.length())
                {
                    result = s.substring(begin, end);
                }
                char firstCharInWindow = s.charAt(begin);
                strMatchRecorder.decreaseChar(firstCharInWindow);
                ++begin;
            }
        }
        return result;
    }

    private static class StringMatchRecorder
    {
        private Set<Character> chars = new HashSet<Character>();
        private Map<Character, Integer> reference = new HashMap<Character, Integer>();
        private Map<Character, Integer> record = new HashMap<Character, Integer>();

        public StringMatchRecorder(String s)
        {
            for (char c : s.toCharArray())
            {
                chars.add(c);
                int count = 0;
                if (this.reference.containsKey(c))
                {
                    count = this.reference.get(c);
                }
                this.reference.put(c, count + 1);
            }
        }

        public void increaseChar(char c)
        {
            int count = 0;
            if (this.record.containsKey(c))
            {
                count = this.record.get(c);
            }
            this.record.put(c, count + 1);
        }

        public boolean decreaseChar(char c)
        {
            if (!this.record.containsKey(c) || this.record.get(c) == 0)
            {
                return false;
            }
            int count = this.record.get(c);
            this.record.put(c, count - 1);
            return true;
        }

        public boolean isAlreadyMatch()
        {
            for (Map.Entry<Character, Integer> entry : this.reference.entrySet())
            {
                char c = entry.getKey();
                int count = entry.getValue();
                if (!this.record.containsKey(c) || this.record.get(c) < count)
                {
                    return false;
                }
            }
            return true;
        }
    }
}
