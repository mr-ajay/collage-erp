

import java.sql.*;

public class connection {

    Connection c;
    Statement s;

    connection () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/clgerp","root","Ajay@123" );
            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}