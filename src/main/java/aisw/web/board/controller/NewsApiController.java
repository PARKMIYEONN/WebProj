package aisw.web.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import aisw.web.biz.board.BoardDAO;
import aisw.web.biz.board.BoardVO;

@RestController
public class NewsApiController {
	
	@Autowired
	BoardDAO dao;
	
	@GetMapping("/newsapi")
	public List<BoardVO> newsList()
	{
		List<BoardVO> boardList = dao.getBoardList();		
		return boardList;
	}
	

}
