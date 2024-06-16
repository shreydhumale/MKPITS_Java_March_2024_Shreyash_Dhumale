package database_Connectivity;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyDatabase {
	public static Connection myConnection() {
        Connection con=null;
        try {
            Class.forName(Model.driver);
            con = DriverManager.getConnection(Model.connection, Model.username, Model.password);

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return con;
    }
}
