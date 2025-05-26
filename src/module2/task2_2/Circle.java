package module2.task2_2;

public class Circle
{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea()
    {
        double area = Math.PI * radius * radius;
        return area;
    }

    public double calculateCircumference()
    {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public void printCircleDetails()
    {
        double area = calculateArea();
        double circumference = calculateCircumference();

        System.out.println("Circle with radius " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}
