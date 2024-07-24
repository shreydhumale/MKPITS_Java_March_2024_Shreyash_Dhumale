import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/register")
public class Register extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Register() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String action = request.getParameter("action");

        if (action == null || action.isEmpty()) {
            out.println("Invalid action");
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_data", "root", "#Shreyash444");

            if (action.equals("read")) {
                PreparedStatement ps = con.prepareStatement("SELECT * FROM user_info");
                ResultSet rs = ps.executeQuery();

                out.println("<table border='1'><tr><th>ID</th><th>Name</th><th>Address</th><th>Country</th></tr>");
                while (rs.next()) {
                    out.println("<tr><td>" + rs.getInt("id") + "</td><td>" + rs.getString("name") + "</td><td>" + rs.getString("address") + "</td><td>" + rs.getString("country") + "</td></tr>");
                }
                out.println("</table>");
            } else if (action.equals("delete")) {
                int id = Integer.parseInt(request.getParameter("id"));
                PreparedStatement ps = con.prepareStatement("DELETE FROM user_info WHERE id = ?");
                ps.setInt(1, id);
                int i = ps.executeUpdate();

                if (i > 0) {
                    out.println("Record deleted successfully");
                } else {
                    out.println("Record not found");
                }
            } else if (action.equals("update")) {
                int id = Integer.parseInt(request.getParameter("id"));
                String name = request.getParameter("name");
                String address = request.getParameter("address");
                String country = request.getParameter("country");

                PreparedStatement ps = con.prepareStatement("UPDATE user_info SET name = ?, address = ?, country = ? WHERE id = ?");
                ps.setString(1, name);
                ps.setString(2, address);
                ps.setString(3, country);
                ps.setInt(4, id);

                int i = ps.executeUpdate();

                if (i > 0) {
                    out.println("Record updated successfully");
                } else {
                    out.println("Record not found");
                }
            }
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String country = request.getParameter("country");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_data", "root", "#Shreyash444");

            PreparedStatement ps = con.prepareStatement("INSERT INTO user_info (name, address, country) VALUES (?, ?, ?)");
            
            ps.setString(1, name);
            ps.setString(2, address);
            ps.setString(3, country);

            int i = ps.executeUpdate();
            
            if (i > 0) {
                out.println("Registration success");
            }

        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    }
}
