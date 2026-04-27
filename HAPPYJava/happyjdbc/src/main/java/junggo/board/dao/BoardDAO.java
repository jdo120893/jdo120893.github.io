package junggo.board.dao;

import junggo.board.dto.BoardDTO;

import java.util.List;

public interface BoardDAO {
    boolean insertBoard(BoardDTO boardDTO);
    List<BoardDTO> selectBoard();
}
