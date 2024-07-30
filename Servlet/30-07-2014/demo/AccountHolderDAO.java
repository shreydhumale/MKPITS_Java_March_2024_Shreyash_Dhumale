package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountHolderDAO {
    private Connection getConnection() throws SQLException, ClassNotFoundException {
        return DatabaseHelper.getConnection();
    }

    public boolean register(AccountHolder account) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO accountholder (name, email, password) VALUES (?, ?, ?)";
        try (Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(query)){
            ps.setString(1, account.getName());
            ps.setString(2, account.getEmail());
            ps.setString(3, account.getPassword());
            return ps.executeUpdate()>0;
        }
    }

    public boolean login(AccountHolder account) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM accountholder WHERE email = ? AND password = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, account.getEmail());
            ps.setString(2, account.getPassword());
            try (ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }

    public boolean deposit(AccountHolder account, double amount) throws SQLException, ClassNotFoundException {
        String query = "UPDATE accountholder SET balance = balance + ? WHERE email = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setDouble(1, amount);
            ps.setString(2, account.getEmail());
            return ps.executeUpdate() > 0;
        }
    }

    public boolean withdraw(AccountHolder account, double amount) throws SQLException, ClassNotFoundException {
        String checkBalanceQuery = "SELECT balance FROM accountholder WHERE email = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(checkBalanceQuery)) {
            ps.setString(1, account.getEmail());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    double currentBalance = rs.getDouble("balance");
                    if (currentBalance >= amount) {
                        String updateQuery = "UPDATE accountholder SET balance = balance - ? WHERE email = ?";
                        try (PreparedStatement updatePs = con.prepareStatement(updateQuery)) {
                            updatePs.setDouble(1, amount);
                            updatePs.setString(2, account.getEmail());
                            return updatePs.executeUpdate() > 0;
                        }
                    }
                }
            }
        }
        return false;
    }

    public double getBalance(AccountHolder account) throws SQLException, ClassNotFoundException {
        String query = "SELECT balance FROM accountholder WHERE email = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, account.getEmail());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getDouble("balance");
                }
            }
        }
        return 0;
    }
}
