package module2.task2_8;

public class StringManipulator {
    public String manipulateString(String input)
    {
        StringBuilder result = new StringBuilder(input.length());
        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            if (Character.isLowerCase(ch))
            {
                result.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch))
            {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
