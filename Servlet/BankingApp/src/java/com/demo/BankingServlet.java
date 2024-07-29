package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import jakarta.servlet.*;

@WebServlet("/banking")
public class BankingServlet extends HttpServlet {

    private Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "#Shreyash444");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        switch (action) {
            case "register":
                register(req, resp);
                break;
            case "login":
                login(req, resp);
                break;
            case "deposit":
                deposit(req, resp);
                break;
            case "withdraw":
                withdraw(req, resp);
                break;
            case "balance":
                showBalance(req, resp);
                break;
            default:
                resp.getWriter().println("Invalid action.");
                break;
        }
    }

    private void register(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO accountholder (name, email, password) VALUES (?, ?, ?)");
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);

            int count = ps.executeUpdate();
            if (count > 0) {
                resp.setContentType("text/html");
                out.print("<h3>User registered successfully</h3>");
                RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
                rd.include(req, resp);
            } else {
                resp.setContentType("text/html");
                out.print("<h3>Unable to register</h3>");
                RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
                rd.include(req, resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resp.setContentType("text/html");
            out.print("<h3>Exception Occurred: " + e.getMessage() + "</h3>");
            RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
            rd.include(req, resp);
        }
    }

    private void login(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        PrintWriter out = resp.getWriter();
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM accountholder WHERE email = ? AND password = ?");
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                resp.setContentType("text/html");
                out.print("<h3>Login successful</h3>");
                RequestDispatcher rd = req.getRequestDispatcher("/banking.jsp");
                rd.include(req, resp);
            } else {
                resp.setContentType("text/html");
                out.print("<h3>Invalid credentials</h3>");
                RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
                rd.include(req, resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resp.setContentType("text/html");
            out.print("<h3>Exception Occurred: " + e.getMessage() + "</h3>");
            RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
            rd.include(req, resp);
        }
    }

    private void deposit(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        PrintWriter out = resp.getWriter();
        String email = req.getParameter("email");
        double amount = Double.parseDouble(req.getParameter("amount"));

        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE accountholder SET balance = balance + ? WHERE email = ?");
            ps.setDouble(1, amount);
            ps.setString(2, email);
            int count = ps.executeUpdate();

            if (count > 0) {
                resp.setContentType("text/html");
                out.print("<h3>Amount deposited successfully</h3>");
                RequestDispatcher rd = req.getRequestDispatcher("/banking.jsp");
                rd.include(req, resp);
            } else {
                resp.setContentType("text/html");
                out.print("<h3>Deposit failed</h3>");
                RequestDispatcher rd = req.getRequestDispatcher("/banking.jsp");
                rd.include(req, resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resp.setContentType("text/html");
            out.print("<h3>Exception Occurred: " + e.getMessage() + "</h3>");
            RequestDispatcher rd = req.getRequestDispatcher("/banking.jsp");
            rd.include(req, resp);
        }
    }

    private void withdraw(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        PrintWriter out = resp.getWriter();
        String email = req.getParameter("email");
        double amount = Double.parseDouble(req.getParameter("amount"));

        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT balance FROM accountholder WHERE email = ?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                double balance = rs.getDouble("balance");
                if (balance >= amount) {
                    ps = con.prepareStatement("UPDATE accountholder SET balance = balance - ? WHERE email = ?");
                    ps.setDouble(1, amount);
                    ps.setString(2, email);
                    int count = ps.executeUpdate();

                    if (count > 0) {
                        resp.setContentType("text/html");
                        out.print("<h3>Amount withdrawn successfully</h3>");
                        RequestDispatcher rd = req.getRequestDispatcher("/banking.jsp");
                        rd.include(req, resp);
                    } else {
                        resp.setContentType("text/html");
                        out.print("<h3>Withdrawal failed</h3>");
                        RequestDispatcher rd = req.getRequestDispatcher("/banking.jsp");
                        rd.include(req, resp);
                    }
                } else {
                    resp.setContentType("text/html");
                    out.print("<h3>Insufficient balance</h3>");
                    RequestDispatcher rd = req.getRequestDispatcher("/banking.jsp");
                    rd.include(req, resp);
                }
            } else {
                resp.setContentType("text/html");
                out.print("<h3>Account not found</h3>");
                RequestDispatcher rd = req.getRequestDispatcher("/banking.jsp");
                rd.include(req, resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resp.setContentType("text/html");
            out.print("<h3>Exception Occurred: " + e.getMessage() + "</h3>");
            RequestDispatcher rd = req.getRequestDispatcher("/banking.jsp");
            rd.include(req, resp);
        }
    }

    private void showBalance(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        PrintWriter out = resp.getWriter();
        String email = req.getParameter("email");

        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT balance FROM accountholder WHERE email = ?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                double balance = rs.getDouble("balance");
                resp.setContentType("text/html");
                out.print("<h3>Your balance is: " + balance + "</h3>");
                RequestDispatcher rd = req.getRequestDispatcher("/banking.jsp");
                rd.include(req, resp);
            } else {
                resp.setContentType("text/html");
                out.print("<h3>Account not found</h3>");
                RequestDispatcher rd = req.getRequestDispatcher("/banking.jsp");
                rd.include(req, resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resp.setContentType("text/html");
            out.print("<h3>Exception Occurred: " + e.getMessage() + "</h3>");
            RequestDispatcher rd = req.getRequestDispatcher("/banking.jsp");
            rd.include(req, resp);
        }
    }
}
