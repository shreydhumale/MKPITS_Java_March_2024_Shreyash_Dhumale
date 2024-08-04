package com.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.model.User;

@WebServlet("/PlayerServlet")
public class PlayerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDao userDao;

    public void init() {
        userDao = new UserDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        try {
            switch (action) {
                case "new":
                    showNewForm(request, response);
                    break;
                case "insert":
                    insertPlayer(request, response);
                    break;
                case "delete":
                    deletePlayer(request, response);
                    break;
                case "edit":
                    showEditForm(request, response);
                    break;
                case "update":
                    updatePlayer(request, response);
                    break;
                default:
                    listPlayers(request, response);
                    break;
            }
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
        dispatcher.forward(request, response);
    }

    private void insertPlayer(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String city = request.getParameter("city");
        int age = Integer.parseInt(request.getParameter("age"));
        
        if (age >= 19) {
            request.setAttribute("errorMessage", "Player must be younger than 19.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
            dispatcher.forward(request, response);
            return;
        }

        User newPlayer = new User(name, email, city, age);
        userDao.insertPlayer(newPlayer);
        response.sendRedirect("PlayerServlet?action=list");
    }

    private void deletePlayer(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String email = request.getParameter("email");
        userDao.deletePlayer(email);
        response.sendRedirect("PlayerServlet?action=list");
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        User existingUser = userDao.selectPlayer(email);
        RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
        request.setAttribute("user", existingUser);
        dispatcher.forward(request, response);
    }

    private void updatePlayer(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        String email = request.getParameter("email");
        String name = request.getParameter("name");
        String city = request.getParameter("city");
        int age = Integer.parseInt(request.getParameter("age"));
        
        if (age >= 19) {
            request.setAttribute("errorMessage", "Player must be younger than 19.");
            User existingUser = userDao.selectPlayer(email);
            request.setAttribute("user", existingUser);
            RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
            dispatcher.forward(request, response);
            return;
        }

        User player = new User(name, email, city, age);
        userDao.updatePlayer(player);
        response.sendRedirect("PlayerServlet?action=list");
    }

    private void listPlayers(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<User> listPlayers = userDao.selectAllPlayers();
        request.setAttribute("listPlayers", listPlayers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
        dispatcher.forward(request, response);
    }
}
