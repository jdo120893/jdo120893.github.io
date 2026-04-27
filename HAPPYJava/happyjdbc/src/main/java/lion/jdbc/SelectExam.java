package lion.jdbc;

import java.sql.*;

public class SelectExam {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/liondb";
        String user = "lion";
        String password = "lion1234";

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
            String sql = "SELECT id, name, email, password FROM member";
            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();

            while(rs.next()){
                System.out.println("test");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (conn != null)
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
        }
        if (ps != null)
            try {
                ps.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        if (rs != null)
            try {
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

    }
}

