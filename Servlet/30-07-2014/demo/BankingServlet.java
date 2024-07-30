package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;

@WebServlet("/banking")
public class BankingServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        AccountHolder account = new AccountHolder();
        account.setEmail(req.getParameter("email"));
        account.setPassword(req.getParameter("password"));

        AccountHolderDAO dao = new AccountHolderDAO();

        try {
            if ("register".equals(action)) {
                account.setName(req.getParameter("name"));
                if (dao.register(account)) {
                    req.setAttribute("message", "User registered successfully");
                } else {
                    req.setAttribute("message", "Unable to register");
                }
                RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
                rd.forward(req, resp);

            } else if ("login".equals(action)) {
                if (dao.login(account)) {
                    req.setAttribute("message", "Login successful");
                    RequestDispatcher rd = req.getRequestDispatcher("/banking.jsp");
                    rd.forward(req, resp);
                } else {
                    req.setAttribute("message", "Invalid credentials");
                    RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
                    rd.forward(req, resp);
                }

            } else if ("deposit".equals(action)) {
                double amount = Double.parseDouble(req.getParameter("amount"));
                if (dao.deposit(account, amount)) {
                    req.setAttribute("message", "Deposit successful");
                } else {
                    req.setAttribute("message", "Deposit failed");
                }
                RequestDispatcher rd = req.getRequestDispatcher("/banking.jsp");
                rd.forward(req, resp);

            } else if ("withdraw".equals(action)) {
                double amount = Double.parseDouble(req.getParameter("amount"));
                if (dao.withdraw(account, amount)) {
                    req.setAttribute("message", "Withdrawal successful");
                } else {
                    req.setAttribute("message", "Withdrawal failed or insufficient funds");
                }
                RequestDispatcher rd = req.getRequestDispatcher("/banking.jsp");
                rd.forward(req, resp);

            } else if ("balance".equals(action)) {
                double balance = dao.getBalance(account);
                req.setAttribute("message","balance of email id "+account.getEmail()+" "+"is: " + balance);
                RequestDispatcher rd = req.getRequestDispatcher("/banking.jsp");
                rd.forward(req, resp);

            } else {
                req.setAttribute("message", "Invalid action.");
                RequestDispatcher rd = req.getRequestDispatcher("/error.jsp");
                rd.forward(req, resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            req.setAttribute("message", "Exception Occurred: " + e.getMessage());
            RequestDispatcher rd = req.getRequestDispatcher("/error.jsp");
            rd.forward(req, resp);
        }
    }
}
