package module2.task2_5;

public class LoanCalculator {
    public double calculateLoanInterest(double loanAmount, double annualInterestRate, int loanTermYears)
    {
        double interestRate = annualInterestRate / 100;
        double totalInterest = 0;

        double monthlyInterest = interestRate / 12;
        double totalPayments = loanTermYears * 12;

        for (int i = 0; i < totalPayments; i++) {
            totalInterest += loanAmount * monthlyInterest;
        }
        return totalInterest;
    }
}