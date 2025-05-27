package module4.task4_3;

public class OrderManager {
    private Order currentOrder;

    public OrderManager(Order order) {
        this.currentOrder = order;
    }

    public void displayOrder()
    {
        System.out.println("Customer: " + currentOrder.getCustomerName());
        System.out.println("Product: " + currentOrder.getProductName());
        System.out.println("Quantity: " + currentOrder.getQuantity());
    }

//    public void updateQuantity(int newQuantity) {
//        currentOrder.setQuantity(newQuantity);
//    }

}

