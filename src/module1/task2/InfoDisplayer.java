package module1.task2;

public class InfoDisplayer
{
    public void displayPersonInfo(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
    }

    public void displayFriends(FriendManager friendsManager) {
        System.out.println("Friends: " + friendsManager.getAll());
    }

    public void displayEnemies(EnemyManager enemiesManager) {
        System.out.println("Enemies: " + enemiesManager.getAll());
    }

    public void displayTasks(TaskManager tasksManager) {
        System.out.println("Tasks: " + tasksManager.getAll());
    }
}