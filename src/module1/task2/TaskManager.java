package module1.task2;

import java.util.ArrayList;
import java.util.List;

public class TaskManager implements ItemManager<String>
{
    private final List<String> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    @Override
    public void add(String task) {
        tasks.add(task);
    }

    @Override
    public void remove(String task) {
        tasks.remove(task);
    }

    @Override
    public List<String> getAll() {
        return new ArrayList<>(tasks);
    }
}
