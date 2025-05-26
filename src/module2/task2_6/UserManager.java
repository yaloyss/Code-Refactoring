package module2.task2_6;

import java.util.List;

public class UserManager {
    private List<User> users;
    public void addUser(User user)
    {
        if (user != null)
        {
            User localUser = user;
            localUser.setRegistered(true);
            users.add(localUser);
        }
    }
}