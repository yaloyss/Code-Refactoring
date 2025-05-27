package module6.task6_4;

public class Calculator4 {

    public int calculatingExponent(int num, int exponent)
    {
        int result = 1;
        for (int i = 0; i < exponent; i++)
        {
            result *= num;
        }
        return result;
    }
}

