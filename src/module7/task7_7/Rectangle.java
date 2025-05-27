package module7.task7_7;

public class Rectangle implements Shape7 {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea()
    {
        return width * height;
    }

    @Override
    public double calculatePerimeter()
    {
        return 2 * (width + height);
    }
}
