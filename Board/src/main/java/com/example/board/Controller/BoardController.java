package com.example.board.Controller;


import com.example.board.DTO.BoardDTO;
import com.example.board.Entity.Board;
import com.example.board.Service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor

public class BoardController {

    private final BoardService boardService;
    // 게시글 하나 띄우기
    @GetMapping("/getBoard")
    public Optional<Board> getBoard(@RequestParam(name = "boardId") Long boardId) {
        return boardService.getBoard (boardId);
    }
    // 게시글 작성하기
    @PostMapping("/postBoard")
    public void postBoard (@RequestBody BoardDTO boarddto) {
        Board board = Board.builder()
                .title(boarddto.getTitle())
                .content(boarddto.getContent())
                .writer(boarddto.getWriter ())
                .build();
        boardService.postBoard(board);

    }

    // 게시글 수정하기
    @PutMapping( "/putBoard")
    public void putBoard(@RequestBody BoardDTO boardDTO) {
        boardService.putBoard(boardDTO);
    }

    // 게시글 삭제하기
    @DeleteMapping("/deleteBoard/{boardId}")
    public void deleteBoard(@PathVariable(name = "boardId") Long boardId) {
        boardService.deleteBoard(boardId);
    }
}
