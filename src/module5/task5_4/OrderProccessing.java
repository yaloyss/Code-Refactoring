package module5.task5_4;

public class OrderProccessing {

    public void processOrder(int quantity, double price)
    {
        if (quantity <= 0) {
            System.out.println("Invalid quantity");
            return;
        }

        if (price <= 0)
        {
            System.out.println("Invalid price");
            return;
        }

        // some logic to process the order
        System.out.println("Order processed successfully");
    }

}
