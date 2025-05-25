package module1.task1;

import java.util.ArrayList;
import java.util.List;

public class Order
{
    private final String customerName;
    private final List<String> items;

    public Order(String customerName, List<String> items)
    {
        this.customerName = customerName;
        this.items = new ArrayList<>(items);
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<String> getItems() {
        return items;
    }
}
