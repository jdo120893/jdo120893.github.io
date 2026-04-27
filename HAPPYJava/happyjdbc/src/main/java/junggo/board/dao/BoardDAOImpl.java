package junggo.board.dao;

import junggo.board.dto.BoardDTO;
import junggo.common.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BoardDAOImpl implements BoardDAO {
    // 글작성
    public boolean insertBoard(BoardDTO boardDTO) {
        boolean result = false;
        String sql = "insert into board(user_id, title, text, price, category) values(?, ?, ?, ?, ?)";

        try (
                Connection conn = DBUtil.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
        ) {
            ps.setInt(1, boardDTO.getUser_Id());
            ps.setString(2, boardDTO.getTitle());
            ps.setString(3, boardDTO.getText());
            ps.setInt(4, boardDTO.getPrice());
            ps.setInt(5, boardDTO.getCategory());
            ps.executeUpdate();
            result = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    //목록 전체  조회
    public List<BoardDTO> selectBoard() {
        String sql = "select * from board";
        try (
                Connection conn = DBUtil.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()
        ) {
            List<BoardDTO> list = new ArrayList<>();
            while (rs.next()) {
                BoardDTO dto = new BoardDTO();
                dto.setId(rs.getInt("id"));
                dto.setUser_Id(rs.getInt("user_id"));
                dto.setTitle(rs.getString("title"));
                dto.setText(rs.getString("text"));
                dto.setPrice(rs.getInt("price"));
                dto.setStatus(rs.getInt("status"));
                dto.setCategory(rs.getInt("category"));
                Object createAtObj = rs.getObject("create_at");
                if(createAtObj != null){
                    dto.setCreateAt(rs.getTimestamp("create_at").toLocalDateTime());
                }
//                dto.setCreateAt(rs.getObject(8, LocalDateTime.class));
                list.add(dto);
            }
            return list;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
