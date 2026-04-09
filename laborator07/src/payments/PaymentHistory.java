package payments;

public class PaymentHistory {

    private Payment[] payments;

    public PaymentHistory(Payment[] payments) {
        this.payments = payments;
    }

    public Payment[] getPayments() {
        return payments;
    }


}
