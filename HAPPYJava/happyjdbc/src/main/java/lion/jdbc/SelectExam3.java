package lion.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectExam3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/liondb";
        String user = "lion";
        String password = "lion1234";

        String sql = "SELECT id, name, email, password FROM member";

        try(
                Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                ) {
            while (rs.next()){
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
            }


        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
