package aisw.web.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aisw.web.biz.board.BoardDAO;
import aisw.web.biz.board.BoardVO;

@Controller
public class BoardListController{
	

	@Autowired
	BoardDAO dao;
	
	
	@RequestMapping("/index")
	public String index(Model model)
	{
		List<BoardVO> boardList = dao.getBoardList();
		model.addAttribute("board", boardList);
		
		return "index";
	}
	
	@GetMapping("/newsapi")
	public List<BoardVO> newsList()
	{
		List<BoardVO> boardList = dao.getBoardList();		
		return boardList;
	}
	
	
	@RequestMapping("/post")
	public String post(Model model, Integer postNo)
	{
		BoardVO board = dao.getPost(postNo);
		model.addAttribute("board", board);
		
		return "post";
	}
	
	@RequestMapping("/posting")
	public String posting()
	{
		return "posting";
	}
	
	@RequestMapping("/postingprocess")
	public String postingprocess(Model model, BoardVO board)
	{
		BoardVO vo = dao.posting(board);
		model.addAttribute("board", vo);
		
		return "redirect:/index";
	}
	
	@RequestMapping("/deletepost")
	public String deletepost(Model model, Integer postNo)
	{
		dao.deleteNews(postNo);
		
		return "redirect:/index";
	}
	
	
	
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//
//		List<BoardVO> boardList = dao.getBoardList();
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("board", boardList);
//		mv.setViewName("index");
//		return mv;
//	}	

}
