package module4;

import module4.task4_1.Product;
import module4.task4_10.BeautyProduct;
import module4.task4_10.ClothingProduct;
import module4.task4_10.Product3;
import module4.task4_11.CompletedOrderState;
import module4.task4_11.Order11;
import module4.task4_9.Product1;
import module4.task4_2.Car;
import module4.task4_2.CarData;
import module4.task4_3.Order;
import module4.task4_3.OrderManager;
import module4.task4_4.Course;
import module4.task4_4.Student;
import module4.task4_9.ProductType;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {

        System.out.println("TASK 4.1~~~~~~~~~~~~~~~~~~~~~~~~");
        Product product1 = new Product("Gold Ring", 2600.0, "UAH");
        Product product2 = new Product("Silver Necklace", 150.0, "USD");
        System.out.println(product1.getCurrencyCode());
        System.out.println(product2.getCurrencyCode());

        System.out.println("TASK 4.2~~~~~~~~~~~~~~~~~~~~~~~~");
        List<Car> cars = new ArrayList<>();
        CarData carData = new CarData(cars);
        carData.addCar(new Car("BMW", 120000.0, 2021));
        carData.addCar(new Car("Mini", 60000.0, 2020));
        carData.printCars();

        System.out.println("TASK 4.3~~~~~~~~~~~~~~~~~~~~~~~~");
        Order order = new Order("Cory", "Laptop", 2);
        OrderManager manager = new OrderManager(order);

        manager.displayOrder();
        manager.displayOrder();

        System.out.println("TASK 4.4~~~~~~~~~~~~~~~~~~~~~~~~");
        Student student = new Student("Charles");
        Course course = new Course("Java Basics");
        student.enrollCourse(course);

        System.out.println("Courses of " + student.getName() + ":");
        for (Course c : student.getCourses())
        {
            System.out.println("- " + c.getTitle());
        }
        System.out.println("Students in " + course.getTitle() + ":");
        for (Student s : course.getStudents())
        {
            System.out.println("- " + s.getName());
        }

        System.out.println("TASK 4.9~~~~~~~~~~~~~~~~~~~~~~~~");
        ProductType electronics = new ProductType("Electronics");
        ProductType clothing = new ProductType("Clothing");

        Product1 laptop = new Product1(electronics, "Laptop");
        Product1 jeans = new Product1(clothing, "Jeans");

        System.out.println(laptop.getName() + " - " + laptop.getType().getName());
        System.out.println(jeans.getName() + " - " + jeans.getType().getName());

        System.out.println("TASK 4.10~~~~~~~~~~~~~~~~~~~~~~~~");
        Product3 phone = new BeautyProduct("Smartphone");
        Product3 tshirt = new ClothingProduct("T-Shirt");

        phone.process();
        tshirt.process();

        System.out.println("TASK 4.11~~~~~~~~~~~~~~~~~~~~~~~~");
        Order11 order11 = new Order11();
        order11.process();
        order11.process();  // processing
        order11.setState(new CompletedOrderState());
        order11.process();  // completed
    }
}

