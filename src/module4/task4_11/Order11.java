package module4.task4_11;

public class Order11 {
    private OrderState state;

    public Order11() {
        this.state = new NewOrderState();
    }

    public void setState(OrderState state)
    {
        this.state = state;
    }

    public void process()
    {
        state.handleOrder(this);
    }
}
