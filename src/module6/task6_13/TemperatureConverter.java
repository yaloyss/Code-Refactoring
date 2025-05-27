package module6.task6_13;

public class TemperatureConverter {

    public static Double convertToCelsius(double fahrenheit)
    {
        if (fahrenheit < -459.67) {
            System.out.println("Error: temperature is less than zero.");
            return null;
        }
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args)
    {
        Double celsius = convertToCelsius(-500);
        if (celsius != null)
        {
            System.out.println("Temperature in Celsius: " + celsius);
        } else {
            System.out.println("Conversion failed due to invalid input.");
        }
    }
}

