package com.xtkj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xtkj.pojo.User;

@Mapper
public interface UserMapper {
	int deleteByPrimaryKey(Integer user_id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer user_id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	List<User> getUser();
}