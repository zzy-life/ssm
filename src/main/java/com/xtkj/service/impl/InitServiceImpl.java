package com.xtkj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xtkj.dao.UserMapper;
import com.xtkj.pojo.User;
import com.xtkj.service.InitService;

@Service
public class InitServiceImpl implements InitService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> getUsers() {
		List<User> list = userMapper.getUsers();
		System.out.println(list.toString());
		return list;
	}
}
