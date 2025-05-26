package module2.task2_7;

public class OrderProcessorHelper {
    private final Order order;
    private double totalCost;
    private int itemCount;

    public OrderProcessorHelper(Order order)
    {
        this.order = order;
        this.totalCost = 0;
//        this.itemCount = order.getItemCount();
    }


    private void calculateTotalCost()
    {
        for (int i = 0; i < itemCount; i++)
        {
//            double price = order.itemPrices.get(i);
//            int quantity = order.itemQuantities.get(i);
//            totalCost += price * quantity;
        }
    }

    private void applyVipDiscount()
    {
//        if (order.isVip)
        {
            totalCost -= totalCost * 0.1;
        }
    }

    private void finalizeOrder()
    {
//        order.totalCost = totalCost;
//        order.status = "Processed";
    }

    public void process()
    {
        calculateTotalCost();
        applyVipDiscount();
        finalizeOrder();
    }
}

