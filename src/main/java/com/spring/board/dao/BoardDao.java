package com.spring.board.dao;

import java.util.HashMap;
import java.util.List;

import com.spring.board.vo.BoardVo;

public interface BoardDao {
	public List<BoardVo> selectAll(HashMap<String, Object> map);
	public BoardVo select(HashMap<String, Object> map);
	public void insert(HashMap<String, Object> map);
	public void update(HashMap<String, Object> map);
	public void delete(HashMap<String, Object> map);
}
