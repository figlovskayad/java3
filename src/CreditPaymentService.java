public class CreditPaymentService {
    public double calculate(int periods, double interestRate, int loanAmount) {
        double monthlyRate = interestRate / 12 / 100;
        double coefficient = (monthlyRate * (Math.pow(1 + monthlyRate, periods))) / ((Math.pow(1 + monthlyRate, periods)) - 1);
        double monthlyPayment = coefficient * loanAmount;
        return monthlyPayment;

    }
}
