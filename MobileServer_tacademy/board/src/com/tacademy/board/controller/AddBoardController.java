package com.tacademy.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tacademy.board.dao.BoardDAO;
import com.tacademy.board.vo.Board;

public class AddBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BoardDAO dao = new BoardDAO();	
		
		Board board = new Board();
		board.setTitle( request.getParameter("title") );
		board.setWriter( request.getParameter("writer") );
		board.setContent( request.getParameter("content") );
		 
		dao.doInsert(board);
		
		return "getBoardList.do";
	}

}
