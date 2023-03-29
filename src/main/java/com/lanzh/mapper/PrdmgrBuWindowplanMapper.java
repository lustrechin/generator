package com.lanzh.mapper;

import com.lanzh.model.PrdmgrBuWindowplan;

public interface PrdmgrBuWindowplanMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PrdmgrBuWindowplan record);

    int insertSelective(PrdmgrBuWindowplan record);

    PrdmgrBuWindowplan selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PrdmgrBuWindowplan record);

    int updateByPrimaryKey(PrdmgrBuWindowplan record);
}