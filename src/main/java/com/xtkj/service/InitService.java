package com.xtkj.service;

import java.util.List;

import com.xtkj.pojo.User;

public interface InitService {
	int deleteByPrimaryKey(Integer userId);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer userId);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	public List<User> getUsers();
}
