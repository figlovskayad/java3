public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int monthlyPayment = (int) service.calculate(12, 9.99, 1_000_000);
        System.out.println("Ежемесячный платеж " + monthlyPayment);
        System.out.println();
        monthlyPayment = (int) service.calculate(24, 9.99, 1_000_000);
        System.out.println("Ежемесячный платеж " + monthlyPayment);
        System.out.println();
        monthlyPayment = (int) service.calculate(36, 9.99, 1_000_000);
        System.out.println("Ежемесячный платеж " + monthlyPayment);
    }
}