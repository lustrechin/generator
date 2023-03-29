package com.lanzh.mapper;

import com.lanzh.model.PrdmgrBuWindowchildren;

public interface PrdmgrBuWindowchildrenMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PrdmgrBuWindowchildren record);

    int insertSelective(PrdmgrBuWindowchildren record);

    PrdmgrBuWindowchildren selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PrdmgrBuWindowchildren record);

    int updateByPrimaryKey(PrdmgrBuWindowchildren record);
}