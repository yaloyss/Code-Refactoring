package module3.task3_2;

public class Department {
    private String name;
    private Employee manager;

    public Department(String name, Employee manager) {
        this.name = name;
        this.manager = manager;
    }

    public Employee getManager()
    {
        return manager;
    }

    public String getManagerName() {
        return manager.getName();
    }
}