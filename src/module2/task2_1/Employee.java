package module2.task2_1;

public class Employee {
    private double baseSalary;
    private int overtimeHours;
    private double bonusPercentage;
    private double taxRate;

    public Employee(double baseSalary, int overtimeHours, double bonusPercentage, double taxRate) {
        this.baseSalary = baseSalary;
        this.overtimeHours = overtimeHours;
        this.bonusPercentage = bonusPercentage;
        this.taxRate = taxRate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    public int getOvertimeHours() {
        return overtimeHours;
    }
    public double getBonusPercentage() {
        return bonusPercentage;
    }
    public double getTaxRate() {
        return taxRate;
    }
}