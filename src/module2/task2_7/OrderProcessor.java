package module2.task2_7;

public class OrderProcessor {
    public void processOrder(Order order) {
        OrderProcessorHelper helper = new OrderProcessorHelper(order);
        helper.process();
    }
}

