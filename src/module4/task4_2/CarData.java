package module4.task4_2;

import java.util.List;

public class CarData {

    private List<Car> cars;

    public CarData(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void addCar(Car car)
    {
        cars.add(car);
    }

    public void printCars()
    {
        for (Car car : cars)
        {
            System.out.println(car.getName() + " " + car.getPrice() + " " + car.getYear());
        }
    }

}
