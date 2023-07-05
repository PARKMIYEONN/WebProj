package aisw.web.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import aisw.web.biz.board.BoardDAO;
import aisw.web.biz.board.BoardVO;

public class BoardListController implements Controller{
	
	BoardDAO dao = new BoardDAO();
	List<BoardVO> boardList = dao.getBoardList();
	
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mv = new ModelAndView();
		mv.addObject("board", boardList);
		mv.setViewName("index");
		return mv;
	}
	
	
	

}
