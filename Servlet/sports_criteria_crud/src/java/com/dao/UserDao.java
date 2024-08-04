package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.model.User;

public class UserDao {
    private String jdbcURL = "jdbc:mysql://localhost:3306/sports_criteria?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "#Shreyash444";

    private static final String INSERT_USER_SQL = "INSERT INTO players (name, email, city, age) VALUES (?, ?, ?, ?);";
    private static final String SELECT_USER_BY_EMAIL = "SELECT name, email, city, age FROM players WHERE email = ?;";
    private static final String SELECT_ALL_USERS = "SELECT * FROM players;";
    private static final String DELETE_USER_SQL = "DELETE FROM players WHERE email = ?;";
    private static final String UPDATE_USER_SQL = "UPDATE players SET name = ?, email = ?, city = ?, age = ? WHERE email = ?;";

    public UserDao() {}

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void insertPlayer(User user) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_SQL)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCity());
            preparedStatement.setInt(4, user.getAge());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public User selectPlayer(String email) {
        User user = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_EMAIL)) {
            preparedStatement.setString(1, email);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String city = rs.getString("city");
                int age = rs.getInt("age");
                user = new User(name, email, city, age);
            }
        } catch (SQLException e) {
            
        }
        return user;
    }

    public List<User> selectAllPlayers() {
        List<User> users = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String city = rs.getString("city");
                int age = rs.getInt("age");
                users.add(new User(name, email, city, age));
            }
        } catch (SQLException e) {
        }
        return users;
    }

    public boolean deletePlayer(String email) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_USER_SQL)) {
            statement.setString(1, email);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    public boolean updatePlayer(User user) throws SQLException {
        boolean updated;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_USER_SQL)) {
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getCity());
            statement.setInt(4, user.getAge());
            statement.setString(5, user.getEmail());
            updated = statement.executeUpdate() > 0;
        }
        return updated;
    }
}
