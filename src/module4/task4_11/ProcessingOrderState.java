package module4.task4_11;

public class ProcessingOrderState implements OrderState {

    @Override
    public void handleOrder(Order11 order) {
        System.out.println("Order is processing.");
    }
}