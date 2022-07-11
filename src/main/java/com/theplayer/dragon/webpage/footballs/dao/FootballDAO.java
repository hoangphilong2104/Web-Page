package com.theplayer.dragon.webpage.footballs.dao;

import java.util.List;

public interface FootballDAO<T> {
	List<T> selectList();
	int insert(T arg);
	int delete(T arg);
	T selectOne();
	int update(T arg);
	T find(T arg);
}
