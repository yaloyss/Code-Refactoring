package module1.task1;

import java.util.List;

public class OrderProcessor
{
    private double calculateTotalPrice(List<String> items)
    {
        double total = 0.0;
        for (String item : items)
        {
            total += getPriceForItem(item);
        }
        return total;
    }

    private double getPriceForItem(String item)
    {
        return 10.0; //some price
    }

    public void process(Order order)
    {
        double totalPrice = calculateTotalPrice(order.getItems());
        System.out.println("Processing order for: " + order.getCustomerName());
        System.out.println("Total price: " + totalPrice);
    }


}
