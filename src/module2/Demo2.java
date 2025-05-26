package module2;

import module2.task2_1.Employee;
import module2.task2_1.SalaryCalculator;

public class Demo2
{
    public static void main(String[] args)
    {
        //TASK 2.1 ~~~~~~~~~~~~~~~~~~~~~~~
        Employee employee = new Employee(5000, 10, 15, 20);
        SalaryCalculator calculator = new SalaryCalculator();

        double netSalary = calculator.calculateSalary(employee);

        double baseSalary = employee.getBaseSalary();
        double bonus = calculator.calculateBonus(employee);
        double overtime = calculator.calculateOvertimePay(employee);
        double totalBeforeTax = baseSalary + bonus + overtime;
        double tax = calculator.calculateTaxAmount(totalBeforeTax, employee.getTaxRate());

        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Overtime Pay: " + overtime);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Before Tax: " + totalBeforeTax);
        System.out.println("Tax Amount: " + tax);
        System.out.println("Net Salary: " + netSalary);
    }
}
