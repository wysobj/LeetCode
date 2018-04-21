package wysobj;

import java.util.HashSet;
import java.util.Set;

public class IntToRoman {

    private static final int LOWWER_BOUNDRY = 1;
    private static final int UPPER_BOUNDRY = 3999;

    private static final int[] dividers = new int[]{1, 5, 10, 50, 100, 500, 1000};
    private static final char[] romanSymbols = new char[]{'I', 'V', 'X', 'L', 'C', 'D', 'M'};

    public String solution(int num)
    {
        if (num < LOWWER_BOUNDRY || num > UPPER_BOUNDRY)
        {
            throw new InvalidNumberException();
        }
        return transform(num);
    }

    private String transform(int num) {
        if (num == 0)
        {
            return "";
        }
        String result = "";
        int remain = num;
        for (int index = dividers.length-1; index >= 0; index--)
        {
            int curDevider = dividers[index];
            char curSymbol = romanSymbols[index];
            int quotient = remain / curDevider;
            for (int i=0; i<quotient; i++)
            {
                result += curSymbol;
            }
            remain -= quotient * curDevider;
            for (int nextIndex = index - 1; nextIndex >= 0; nextIndex--)
            {
                if (canLeftAppend(nextIndex))
                {
                    int nextDevider = dividers[nextIndex];
                    if (remain + nextDevider >= curDevider)
                    {
                        result += romanSymbols[nextIndex];
                        result += curSymbol;
                        remain = remain + nextDevider - curDevider;
                        result += transform(remain);
                        return result;
                    }
                }
            }
        }
        return result;
    }

    private boolean canLeftAppend(int index) {
        if (index == 0 || index == 2 || index == 4)
        {
            return true;
        }
        return false;
    }

    static class InvalidNumberException extends RuntimeException {
    }
}
