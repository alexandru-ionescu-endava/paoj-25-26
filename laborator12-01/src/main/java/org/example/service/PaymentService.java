package org.example.service;

import org.example.model.FilterRequest;
import org.example.model.Payment;
import org.example.repository.PaymentRepository;

import java.sql.SQLException;
import java.util.List;

public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment insert(Payment payment) {
        return paymentRepository.insert(payment);
    }

    public List<Payment> findAll(FilterRequest filters) {
        try {
            return paymentRepository.findAll(filters);
        } catch (SQLException e) {
            e.printStackTrace();
            return List.of();
        }
    }

    public Payment findById(Integer id) {
        return paymentRepository.findById(id);
    }

}
