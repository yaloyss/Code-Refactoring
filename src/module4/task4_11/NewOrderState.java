package module4.task4_11;

public class NewOrderState implements OrderState {

    @Override
    public void handleOrder(Order11 order) {
        System.out.println("Added new order.");
        order.setState(new ProcessingOrderState());
    }
}