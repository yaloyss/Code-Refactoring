package module6.task6_1_and6_2;

public class Calculator
{
//    public int calculatingNumbers(int x, int y)
//    {
//// логіка обчислення
//    }
    public double calculateTotal(double price, int quantity, double taxRate)
    {
        double total = price * quantity;
        return total + (total * taxRate);
    }
}
