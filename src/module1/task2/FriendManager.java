package module1.task2;

import java.util.ArrayList;
import java.util.List;

public class FriendManager implements ItemManager<String>
{
    private List<String> friends;

    public FriendManager() {
        this.friends = new ArrayList<>();
    }

    @Override
    public void add(String friend) {
        friends.add(friend);
    }

    @Override
    public void remove(String friend) {
        friends.remove(friend);
    }

    @Override
    public List<String> getAll() {
        return new ArrayList<>(friends);
    }
}