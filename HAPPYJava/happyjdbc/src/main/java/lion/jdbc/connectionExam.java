package lion.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionExam {
    public static void main(String[] args) throws Exception{
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/liondb";
        String user = "lion";
        String password = "lion1234";
        conn = DriverManager.getConnection(url,user,password);

        if(conn != null)
            System.out.println("^^");
        else
            System.out.println("-_-;;");

        conn.close();
    }
}
