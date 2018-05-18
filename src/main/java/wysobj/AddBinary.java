package wysobj;

public class AddBinary
{
    public String addBinary(String a, String b)
    {
        if (a == null || b == null)
        {
            return null;
        }

        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        int length = charsA.length > charsB.length ? charsA.length : charsB.length;
        StringBuilder result = new StringBuilder();
        char carry = '0';
        for (int i = 0; i < length; i++)
        {
            char charA = i < charsA.length ? charsA[charsA.length - 1 - i] : '0';
            char charB = i < charsB.length ? charsB[charsB.length - 1 - i] : '0';
            if (charA == '1' && charB == '1')
            {
                result.insert(0, carry);
                carry = '1';
            }
            else if (charA == '0' && charB == '0')
            {
                result.insert(0, carry);
                carry = '0';
            }
            else
            {
                char inserted = carry == '0' ? '1' : '0';
                result.insert(0, inserted);
            }
        }
        if (carry == '1')
        {
            result.insert(0, '1');
        }
        return result.toString();
    }
}
