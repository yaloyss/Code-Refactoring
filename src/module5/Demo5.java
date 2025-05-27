package module5;

import module5.task5_6.Customer;

public class Demo5 {
    public static void main (String[] args) {

        System.out.println("TASK 5.6~~~~~~~~~~~~~~~~~~~~~~~~");
        Customer customer = new Customer(null);
        System.out.println(customer.getAddress().getStreet());
        System.out.println(customer.getAddress().isNull());
        System.out.println(customer.getAddress().getCity());
        System.out.println(customer.getAddress().isNull());

    }

}
