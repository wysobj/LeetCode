package wysobj;

public class RomanToInteger {

    private static final int[] numbers = new int[]{1, 5, 10, 50, 100, 500, 1000};
    private static final char[] romanSymbols = new char[]{'I', 'V', 'X', 'L', 'C', 'D', 'M'};

    public int romanToInt(String roman)
    {
        if (roman == null || roman.length() == 0)
        {
            throw new InvalidRomanException();
        }

        int result = 0;
        char[] symbols = roman.toCharArray();
        for (int i = symbols.length - 1; i >= 0; i--)
        {
            char curSymbol = symbols[i];
            int indexOfCurSymbol = indexOfSymbol(curSymbol);
            int sign = 1;
            if (i + 1 < symbols.length)
            {
                char symbolAfter = symbols[i+1];
                int indexOfAfterSymbol = indexOfSymbol(symbolAfter);
                if (indexOfCurSymbol < indexOfAfterSymbol)
                {
                    sign = -1;
                }
            }
            result += sign * numbers[indexOfCurSymbol];
        }
        return result;
    }

    private int indexOfSymbol(char symbol)
    {
        int index = 0;
        for (; index < romanSymbols.length; index++)
        {
            if (romanSymbols[index] == symbol)
            {
                break;
            }
        }
        if (index == romanSymbols.length)
        {
            throw new InvalidRomanException();
        }
        return index;
    }

    static class InvalidRomanException extends RuntimeException {}
}
