package lion.jdbc;

import java.sql.*;


import java.sql.*;

public class testExam {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/liondb";
        String user = "lion";
        String password = "lion1234";

        // SQL 문 준비
        String updateSql = "UPDATE member SET name = ? WHERE id = ?";
        String deleteSql = "DELETE FROM member WHERE id = ?";
        String selectSql = "SELECT * FROM member";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            // 1. 수정
            try (PreparedStatement pstmt = conn.prepareStatement(updateSql)) {
                pstmt.setString(1, "carami");
                pstmt.setInt(2, 2);
                pstmt.executeUpdate();
            }

            // 2. 삭제
            try (PreparedStatement pstmt = conn.prepareStatement(deleteSql)) {
                pstmt.setInt(1, 2);
                pstmt.executeUpdate();
            }

            // 3. 출력
            try (ResultSet rs = conn.prepareStatement(selectSql).executeQuery()) {
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " : " + rs.getString("name"));
                }
            }
        }
    }
}