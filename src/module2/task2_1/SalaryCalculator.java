package module2.task2_1;

public class SalaryCalculator {


    public double calculateOvertimePay(Employee employee)
    {
        int overtimeHours = employee.getOvertimeHours();
        if (overtimeHours <= 0) {
            return 0;
        }
        double baseSalary = employee.getBaseSalary();
        double overtimeRate = 1.5;

        return overtimeHours * baseSalary * overtimeRate;
    }

    public double calculateBonus(Employee employee)
    {
        double baseSalary = employee.getBaseSalary();
        double bonusPercentage = employee.getBonusPercentage();

        return baseSalary * bonusPercentage / 100;
    }

    private double calculateNetSalary(double grossSalary, double taxRate)
    {
        double taxAmount = calculateTaxAmount(grossSalary, taxRate);
        return grossSalary - taxAmount;
    }

    public double calculateTaxAmount(double totalBeforeTax, double taxRate)
    {
        return totalBeforeTax * taxRate / 100;
    }

    //primary method
    public double calculateSalary(Employee employee)
    {
        double baseSalary = employee.getBaseSalary();
        double overtimePay = calculateOvertimePay(employee);
        double bonus = calculateBonus(employee);

        double totalBeforeTax = baseSalary + overtimePay + bonus;
        double netSalary = calculateNetSalary(totalBeforeTax, employee.getTaxRate());

        return netSalary;
    }

}