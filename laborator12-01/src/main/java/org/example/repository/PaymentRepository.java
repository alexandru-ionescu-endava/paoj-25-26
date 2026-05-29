package org.example.repository;

import org.example.model.FilterRequest;
import org.example.model.Payment;
import org.example.model.PaymentStatus;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PaymentRepository {

    private final String url;
    private final String username;
    private final String password;

    public PaymentRepository(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public List<Payment> findAll(FilterRequest filterRequest) throws SQLException {
        try (var connection = DriverManager.getConnection(url, username, password)) {
            var statement = connection.createStatement();
            var resultSet = statement.executeQuery("SELECT * FROM payments");

            List<Payment> payments = new ArrayList<>();

            while (resultSet.next()) {
                Payment payment = rowMapper(resultSet);
                payments.add(payment);
            }

            return payments;
        } catch (final SQLException e) {
            e.printStackTrace();
            return List.of();
        }
    }

    public Payment findById(Integer id) {
        try (var connection = DriverManager.getConnection(url, username, password)) {
            String sql = """
                    select * from payments p
                    join users u on p.sender_id = u.id
                    join users u2 on p.receiver_id = u2.id
                    where id = ?
                    """;

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();
            Payment payment = null;
            if (resultSet.next()) {
                payment = rowMapper(resultSet);
            }

            return payment;
        } catch (final SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Payment rowMapper(ResultSet resultSet) throws SQLException {
        Payment payment = new Payment();
        payment.setId(resultSet.getInt("id"));
        payment.setSenderId(resultSet.getInt("sender_id"));
        payment.setReceiverId(resultSet.getInt("receiver_id"));
        payment.setAmount(resultSet.getDouble("amount"));
        payment.setStatus(PaymentStatus.valueOf(resultSet.getString("status")));

        return payment;
    }

    public Payment insert(Payment payment) {
        try (var connection = DriverManager.getConnection(url, username, password)) {
            String sql = """
                    insert into payments (sender_id, receiver_id, amount, status)
                    values (?, ?, ?, ?)
                    """;

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, payment.getSenderId());
            statement.setInt(2, payment.getReceiverId());
            statement.setDouble(3, payment.getAmount());
            statement.setString(4, payment.getStatus().name());

            int affectedRows = statement.executeUpdate();
            if (affectedRows > 0) {
                return payment;
            }
        } catch (final SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
