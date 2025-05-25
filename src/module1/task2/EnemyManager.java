package module1.task2;

import java.util.ArrayList;
import java.util.List;

public class EnemyManager implements ItemManager<String>
{
    private final List<String> enemies;

    public EnemyManager() {
        this.enemies = new ArrayList<>();
    }

    @Override
    public void add(String enemy) {
        enemies.add(enemy);
    }

    @Override
    public void remove(String enemy) {
        enemies.remove(enemy);
    }

    @Override
    public List<String> getAll() {
        return new ArrayList<>(enemies);
    }
}