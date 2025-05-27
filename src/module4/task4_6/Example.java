package module4.task4_6;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        final int SUPPLY = 100;

        for (int i = 0; i < SUPPLY; i++)
        {
            items.add("Item " + i);
        }
    }
}