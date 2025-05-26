package module2.task2_4;

public record Item(double price, int quantity)
{
    public double getPrice()
    {
        return price;
    }
    public int getQuantity()
    {
        return quantity;
    }
}
