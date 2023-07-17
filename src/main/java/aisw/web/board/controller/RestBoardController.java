package aisw.web.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import aisw.web.biz.board.BoardJsonDAO;
import aisw.web.biz.board.EziBoardVO;
import aisw.web.biz.board.HariBoardVO;
import aisw.web.biz.board.JoyBoardVO;

@Controller
public class RestBoardController {
	
	@Autowired
	BoardJsonDAO dao;
	
	@RequestMapping("/joy")
	public String getJoy(Model model)
	{
		try {
			List<JoyBoardVO> joyBoardList = dao.getJoyList();
			model.addAttribute("board", joyBoardList);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "joy";
	}
	
	@RequestMapping("/hari")
	public String getHari(Model model)
	{
		try {
			List<HariBoardVO> hariBoardList = dao.getHariList();
			model.addAttribute("board", hariBoardList);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "hari";
	}
	
	@RequestMapping("/ezi")
	public String getEzi(Model model)
	{
		try {
			List<EziBoardVO> eziBoardList = dao.getEziList();
			model.addAttribute("board", eziBoardList);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "ezi";
	}
}
