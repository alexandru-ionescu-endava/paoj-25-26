package payments;

public class PaymentServiceImpl
        implements PaymentService {

    private PaymentHistory paymentHistory;

    public PaymentHistory getPaymentHistory() {
        return paymentHistory;
    }

    public void listPayments() {
        Payment[] payments = paymentHistory.getPayments();

        for (Payment payment : payments) {
            System.out.println("Payment ID: " + payment.getId() + ", Sender ID: " + payment.getSenderId() + ", Receiver ID: " + payment.getReceiverId() + ", Amount: " + payment.getAmount() + ", Status: " + payment.getPaymentStatus());
        }
    }

    public void filterPaymentsByStatus(PaymentStatus status) {
        Payment[] payments = paymentHistory.getPayments();

        for (Payment payment : payments) {
            if (payment.getPaymentStatus() == status) {
                System.out.println("Payment ID: " + payment.getId() + ", Sender ID: " + payment.getSenderId() + ", Receiver ID: " + payment.getReceiverId() + ", Amount: " + payment.getAmount() + ", Status: " + payment.getPaymentStatus());
            }
        }
    }

    // handle Array resize

    // add a method to add a payment to the history

    // add a method to get the total amount of payments in the history

    // filter payments by status

    // filter payments by sender or receiver


    @Override
    public void processPayment(User sender, User receiver, Double amount) {

    }

    @Override
    public PaymentStatus getPaymentStatus(Integer paymentId) {
        return null;
    }

    @Override
    public PaymentHistory getPaymentHistory(User user) {
        return null;
    }
}
