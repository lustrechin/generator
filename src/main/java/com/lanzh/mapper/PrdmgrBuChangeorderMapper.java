package com.lanzh.mapper;

import com.lanzh.model.PrdmgrBuChangeorder;

public interface PrdmgrBuChangeorderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PrdmgrBuChangeorder record);

    int insertSelective(PrdmgrBuChangeorder record);

    PrdmgrBuChangeorder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PrdmgrBuChangeorder record);

    int updateByPrimaryKey(PrdmgrBuChangeorder record);
}