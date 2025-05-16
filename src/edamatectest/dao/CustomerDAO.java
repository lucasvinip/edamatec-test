package edamatectest.dao;

import edamatectest.connection.Connecting;
import java.sql.*;
import edamatectest.model.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {

    private static String sql = "";

    private Connection getConnetion() {
        try {
            return Connecting.connect();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco: " + e.getMessage());
            return null;
        }
    }

    public List<Customer> getAllCustomer() {
        List<Customer> customersArray = new ArrayList<>();
        sql = "select * from customer";
        try (
                Statement stmt = getConnetion().createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Customer customer = new Customer(
                        rs.getInt("id"),
                        rs.getString("customer_name"),
                        rs.getString("cpf"),
                        rs.getString("phone"),
                        rs.getString("email")
                );

                customersArray.add(customer);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar clientes: " + e.getMessage());
        }
        return customersArray;
    }

    public List<Customer> searchCustomers(String searchTerm) {
        List<Customer> customers = new ArrayList<>();
        sql = "SELECT * FROM customer WHERE "
                + "customer_name LIKE ? OR "
                + "cpf LIKE ? OR "
                + "phone LIKE ? OR "
                + "email LIKE ?";

        try (PreparedStatement pstmt = getConnetion().prepareStatement(sql)) {
            String term = "%" + searchTerm + "%";
            pstmt.setString(1, term);
            pstmt.setString(2, term);
            pstmt.setString(3, term);
            pstmt.setString(4, term);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setCustomerName(rs.getString("customer_name"));
                customer.setCpf(rs.getString("cpf"));
                customer.setPhone(rs.getString("phone"));
                customer.setEmail(rs.getString("email"));
                customers.add(customer);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar clientes: " + e.getMessage());
        }

        return customers;
    }

    public boolean insertCustomer(Customer customer) throws SQLException {
        sql
                = "insert into customer(customer_name, cpf, phone, email) values (?, ?, ?, ?)";

        try (
                PreparedStatement pstmt = getConnetion().prepareStatement(sql);) {
            pstmt.setString(1, customer.getCustomerName());
            pstmt.setString(2, customer.getCpf());
            pstmt.setString(3, customer.getPhone());
            pstmt.setString(4, customer.getEmail());

            int rowsInserted = pstmt.executeUpdate();
            return rowsInserted > 0;
        }
    }

    public int updateCustomer(Customer customer) {
        sql = "update customer SET customer_name = ?, phone = ?, email = ? where cpf = ?";

        try (
                PreparedStatement pstmt = getConnetion().prepareStatement(sql)) {
            pstmt.setString(1, customer.getCustomerName());
            pstmt.setString(2, customer.getPhone());
            pstmt.setString(3, customer.getEmail());
            pstmt.setString(4, customer.getCpf());

            int rowsUpdated = pstmt.executeUpdate();
            System.out.println(rowsUpdated);
            if (rowsUpdated != 0) {
                return rowsUpdated;
            } else {
                return 0;
            }

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar cliente: " + e.getMessage());
            return 0;
        }
    }

    public Customer getCustomerByCpf(String cpf) {
        sql = "select * from customer where cpf = ?";
        try (PreparedStatement stmt = getConnetion().prepareStatement(sql)) {
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Customer custumer = new Customer();
                custumer.setCustomerName(rs.getString("customer_name"));
                custumer.setCpf(rs.getString("cpf"));
                custumer.setPhone(rs.getString("phone"));
                custumer.setEmail(rs.getString("email"));
                return custumer;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar cliente: " + e.getMessage());
        }
        return null;
    }

    public boolean deleteCustomer(String cpf) {
        sql = "delete from customer where cpf = ?";

        try (
                PreparedStatement pstmt = getConnetion().prepareStatement(sql)) {
            pstmt.setString(1, cpf);

            int rowsDeleted = pstmt.executeUpdate();
            return rowsDeleted > 0;

        } catch (SQLException e) {
            System.out.println("Erro ao deletar cliente: " + e.getMessage());
            return false;
        }
    }
}
