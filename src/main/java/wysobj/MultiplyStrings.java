package wysobj;

public class MultiplyStrings
{
    public String multiply(String s1, String s2)
    {
        if (s1 == null || s2 == null)
        {
            return null;
        }
        if (s1.length() < 1 || s2.length() < 1)
        {
            return "";
        }
        String result = "0";
        for (int i = 0; i < s1.length(); i++)
        {
            result = strMultiplyTen(result);
            char digit = s1.charAt(i);
            String multiplication = strMultiplyChar(s2, digit);
            result = strAdd(result, multiplication);
        }
        return result;
    }

    private String strMultiplyChar(String s, char c)
    {
        if (s.equals("0") || c == '0')
        {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        int digit;
        int carry = 0;
        int digitOfChar = c - '0';
        for (int i = s.length() - 1; i >= 0; i--)
        {
            int digitI = s.charAt(i) - '0';
            int multiplication = digitI * digitOfChar + carry;
            digit = multiplication % 10;
            carry = multiplication / 10;
            result.insert(0, digit);
        }
        if (carry > 0)
        {
            result.insert(0, carry);
        }
        return result.toString();
    }

    private String strMultiplyTen(String s)
    {
        if (s.equals("0"))
        {
            return s;
        }
        String result = s + "0";
        return result;
    }

    private String strAdd(String s1, String s2)
    {
        StringBuilder result = new StringBuilder();
        if (s1.length() > s2.length())
        {
            s2 = paddingZero(s2, s1.length() - s2.length());
        }
        else
        {
            s1 = paddingZero(s1, s2.length() - s1.length());
        }
        int digit;
        int carry = 0;
        for (int i = s1.length() - 1; i >= 0; i--)
        {
            int digit1 = s1.charAt(i) - '0';
            int digit2 = s2.charAt(i) - '0';
            int sum = digit1 + digit2 + carry;
            digit = sum % 10;
            carry = sum / 10;
            result.insert(0, digit);
        }
        if (carry == 1)
        {
            result.insert(0, 1);
        }
        return result.toString();
    }

    private String paddingZero(String s, int num)
    {
        if (num == 0)
        {
            return s;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num; i++)
        {
            result.append('0');
        }
        result.append(s);
        return result.toString();
    }
}
