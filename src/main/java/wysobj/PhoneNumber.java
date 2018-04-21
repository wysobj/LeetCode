package wysobj;

import java.util.*;

public class PhoneNumber {

    private static final String[] mapping = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        if (digits == null || digits.length() == 0)
        {
            return result;
        }
        Set<String> filled = new HashSet<String>();
        filled.add("");
        Set<String> empty = new HashSet<String>();
        char[] digitChars = digits.toCharArray();
        for (int i = 0; i < digitChars.length; i++)
        {
            char digitChar = digitChars[i];
            int digit = digitChar - '0';
            if (digit < 2 || digit > 9)
            {
                return result;
            }
            for (String s : filled)
            {
                for (char c : mapping[digit].toCharArray())
                {
                    String copy = new String(s);
                    copy += c;
                    empty.add(copy);
                }
            }
            Set<String> tmp = filled;
            filled = empty;
            empty = tmp;
            empty.clear();
        }
        result.addAll(filled);
        return result;
    }
}
