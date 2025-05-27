package module7.task7_1;

class Truck extends Vehicle {

    private String model;
    private int loadCapacity;

    public Truck(String color, int loadCapacity, String model)
    {
        super(color);
        this.model = model;
        this.loadCapacity = loadCapacity;
    }
}