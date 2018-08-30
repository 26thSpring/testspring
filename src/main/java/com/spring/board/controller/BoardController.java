package com.spring.board.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.board.service.BoardService;
import com.spring.board.vo.BoardVo;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		HashMap<String, Object> map = new HashMap<>();
		List<BoardVo> list = boardService.selectAll(map);
		
		mv.setViewName("home");
		mv.addObject("boardList", list);
		return mv;
	}
	
	
	
	
	
	
}
