package module1.task2;

import java.util.List;

public interface ItemManager<T>
{
    void add(T item);
    void remove(T item);
    List<T> getAll();
}
