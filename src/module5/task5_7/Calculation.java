package module5.task5_7;

public class Calculation {

    public double calculateAverage(int[] numbers)
    {
        assert numbers.length > 0 : "Array must not be empty";

        int sum = 0;
        for (int number : numbers)
        {
            sum += number;
        }
        return sum / numbers.length;
    }

}
