package junggo.board.service;

import junggo.board.dto.BoardDTO;

import java.util.List;

public interface BoardService {
    boolean insertBoard(BoardDTO boardDTO);
    List<BoardDTO> selectBoard();

}
