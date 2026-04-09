package payments;

public interface PaymentService {

    void processPayment(User sender, User receiver, Double amount);

    PaymentStatus getPaymentStatus(Integer paymentId);

    PaymentHistory getPaymentHistory(User user);
}
