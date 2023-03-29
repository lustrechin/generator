package com.lanzh.mapper;

import com.lanzh.model.UserT;

public interface UserTMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserT record);

    int insertSelective(UserT record);

    UserT selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserT record);

    int updateByPrimaryKey(UserT record);
}