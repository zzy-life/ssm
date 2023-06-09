package com.xtkj.mapper;

import com.xtkj.pojo.TClass;

public interface TClassMapper {
    int deleteByPrimaryKey(Integer class_id);

    int insert(TClass record);

    int insertSelective(TClass record);

    TClass selectByPrimaryKey(Integer class_id);

    int updateByPrimaryKeySelective(TClass record);

    int updateByPrimaryKey(TClass record);
}