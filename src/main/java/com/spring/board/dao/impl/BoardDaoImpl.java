package com.spring.board.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.board.dao.BoardDao;
import com.spring.board.vo.BoardVo;

@Repository("boardDao")
public class BoardDaoImpl implements BoardDao {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<BoardVo> selectAll(HashMap<String, Object> map) {
		sqlSession.selectList("Board.selectAll", map);
		List<BoardVo> list = (List<BoardVo>) map.get("result");
		
		return list;
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
