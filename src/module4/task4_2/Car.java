package module4.task4_2;

public class Car {
    private String name;
    private double price;
    private int year;

    public Car (String name, double price, int year)
    {
        this.name = name;
        this.price = price;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getYear() {
        return year;
    }
}
