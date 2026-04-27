package lion.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectOneExam {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/liondb";
        String user = "lion";
        String password = "lion1234";

        String sql = "SELECT id, name, email, password FROM member WHERE id = ?";

        try(
                Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement ps = conn.prepareStatement(sql);
        ) {
            ps.setInt(1, 3);

            try(ResultSet rs = ps.executeQuery()){
                if (rs.next()) {
                    System.out.println(rs.getInt(1));
                    System.out.println(rs.getString(2));
                    System.out.println(rs.getString(3));
                    System.out.println(rs.getString(4));
                }

            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
