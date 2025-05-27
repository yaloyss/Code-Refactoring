package module5.task5_2;

public class Payment {
    public void processPayment(double amount, boolean isMember, boolean
            isDiscountAvailable) {
        if ((amount > 100 && isMember) && (amount > 200 && isDiscountAvailable)) {
//            applyDiscount();
        }
    }
}
