package module6.task6_11;

public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;

    private Car(String brand, String model, int year, String color)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public static Car create(String brand, String model, int year, String color)
    {
        Car car = new Car(brand, model, year, color);
        car.registerCar();
        return car;
    }

    private void registerCar()
    {
        System.out.println("Car registered successfully!");
    }

}
