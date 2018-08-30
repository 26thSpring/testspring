package com.spring.board.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.board.dao.BoardDao;
import com.spring.board.service.BoardService;
import com.spring.board.vo.BoardVo;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardDao boardDao;

	@Override
	public List<BoardVo> selectAll(HashMap<String, Object> map) {
		return boardDao.selectAll(map);
	}

	@Override
	public BoardVo select(HashMap<String, Object> map) {
		return null;
	}

	@Override
	public void insert(HashMap<String, Object> map) {
		
	}

	@Override
	public void update(HashMap<String, Object> map) {
		
	}

	@Override
	public void delete(HashMap<String, Object> map) {
		
	}
	
}
