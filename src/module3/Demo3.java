package module3;

import module3.task3_2.Department;
import module3.task3_2.Employee;
import module3.task3_8.DateHelper;
import module3.task3_8.DateHelperExtended;
import java.util.Date;

public class Demo3
{
    public static void main(String[] args)
    {
        System.out.println("TASK 3.2~~~~~~~~~~~~~~~~~~~~~");
        Department dept = new Department("IT", new Employee("Yan"));
        String managerName = dept.getManagerName();
        System.out.println(managerName);

        System.out.println("TASK 3.3~~~~~~~~~~~~~~~~~~~~~");
        Department dept1 = new Department("Sales", new Employee("Nora"));
        String managerName1 = dept1.getManagerName();
        System.out.println(managerName1);

        System.out.println("TASK 3.8~~~~~~~~~~~~~~~~~~~~~");
        Date today = new Date();
        Date futureDate = DateHelper.addDays(today, 10);
        long daysDiff = DateHelperExtended.differenceInDays(today, futureDate);
        System.out.println("Days between: " + daysDiff);
    }
}

