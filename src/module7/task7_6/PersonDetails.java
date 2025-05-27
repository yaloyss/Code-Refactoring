package module7.task7_6;

public class PersonDetails {

    protected String name;
    protected double salary;

    public PersonDetails (String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}
