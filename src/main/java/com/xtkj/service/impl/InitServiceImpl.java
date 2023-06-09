package com.xtkj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xtkj.mapper.UserMapper;
import com.xtkj.pojo.User;
import com.xtkj.service.InitService;

@Service
public class InitServiceImpl implements InitService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> getUsers() {
		List<User> list = userMapper.getUser();
		return list;
	}

	/**
	 * @Title: deleteByPrimaryKey
	 * @Description: TODO(描述)
	 * @param userId
	 * @return
	 * @author zzy1998
	 * @date 2023-06-09 08:36:08
	 */
	@Override
	public int deleteByPrimaryKey(Integer userId) {
		// TODO 自动生成的方法存根
		return 0;
	}

	/**
	 * @Title: insert
	 * @Description: TODO(描述)
	 * @param record
	 * @return
	 * @author zzy1998
	 * @date 2023-06-09 08:36:08
	 */
	@Override
	public int insert(User record) {
		// TODO 自动生成的方法存根
		return 0;
	}

	/**
	 * @Title: insertSelective
	 * @Description: TODO(描述)
	 * @param record
	 * @return
	 * @author zzy1998
	 * @date 2023-06-09 08:36:08
	 */
	@Override
	public int insertSelective(User record) {
		// TODO 自动生成的方法存根
		return userMapper.insertSelective(record);
	}

	/**
	 * @Title: selectByPrimaryKey
	 * @Description: TODO(描述)
	 * @param userId
	 * @return
	 * @author zzy1998
	 * @date 2023-06-09 08:36:08
	 */
	@Override
	public User selectByPrimaryKey(Integer userId) {
		// TODO 自动生成的方法存根
		return null;
	}

	/**
	 * @Title: updateByPrimaryKeySelective
	 * @Description: TODO(描述)
	 * @param record
	 * @return
	 * @author zzy1998
	 * @date 2023-06-09 08:36:08
	 */
	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO 自动生成的方法存根
		return 0;
	}

	/**
	 * @Title: updateByPrimaryKey
	 * @Description: TODO(描述)
	 * @param record
	 * @return
	 * @author zzy1998
	 * @date 2023-06-09 08:36:08
	 */
	@Override
	public int updateByPrimaryKey(User record) {
		// TODO 自动生成的方法存根
		return 0;
	}
}
