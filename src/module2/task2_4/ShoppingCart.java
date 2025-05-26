package module2.task2_4;

import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public double calculateTotalPrice()
    {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += calculateItemTotalPrice(item);
        }
        return totalPrice;
    }

    private double calculateItemTotalPrice(Item item)
    {
        return item.getPrice() * item.getQuantity();
    }
}
