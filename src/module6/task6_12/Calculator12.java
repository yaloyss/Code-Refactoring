package module6.task6_12;

public class Calculator12
{
    public static int divide(int dividend, int divisor)
    {
        if (divisor == 0)
        {
            throw new ArithmeticException("Dividing by zero is not allowed.");
        }
        return dividend / divisor;
    }

    public static void main(String[] args)
    {
        try {
            int result = divide(10, 0);
            System.out.println("Result of dividing: " + result);
        } catch (ArithmeticException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
