package module1;

import module1.task1.Order;
import module1.task1.OrderProcessor;
import module1.task2.*;

import java.util.List;

public class Demo1 {

    public static void main(String[] args)
    {
        //TASK 1 ~~~~~~~~~~~~~~~~~~~
        List<String> items = List.of("Ring", "Necklace", "Bracelet");
        Order order = new Order("Yana", items);

        OrderProcessor processor = new OrderProcessor();
        processor.process(order);
        System.out.println("TASK 2 ~~~~~~~~~~~~~~~~~~~~~~~~~");

        //TASK 2 ~~~~~~~~~~~~~~~~~~~
        Person person = new Person("Yana", 18, "Female");
        FriendManager friendsManager = new FriendManager();
        TaskManager tasksManager = new TaskManager();
        InfoDisplayer display = new InfoDisplayer();

        friendsManager.add("Kaylie");
        friendsManager.add("Ogirok");

        EnemyManager enemiesManager = new EnemyManager();
        enemiesManager.add("Kinza");

        tasksManager.add("To do project for cross-platform programming");
        tasksManager.add("Learn JavaScript");

        display.displayPersonInfo(person);
        display.displayFriends(friendsManager);
        display.displayEnemies(enemiesManager);
        display.displayTasks(tasksManager);

    }
}
