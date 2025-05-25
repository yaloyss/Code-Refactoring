package module1.task1;

import java.util.List;

// OrderProcessor.java – відповідає за обробку замовлення
public class OrderProcessor
{
    private double calculateTotalPrice(List<String> items)
    {
        double total = 0.0;
        for (String item : items) {
            total += getPriceForItem(item); // Спрощена логіка
        }
        return total;
    }

    private double getPriceForItem(String item) {
        return 10.0; // умовна ціна
    }

    public void process(Order order)
    {
        double totalPrice = calculateTotalPrice(order.getItems());
        // тут би могла бути логіка оплати, логування, повідомлення і т.д.
        System.out.println("Processing order for: " + order.getCustomerName());
        System.out.println("Total price: " + totalPrice);
    }


}
