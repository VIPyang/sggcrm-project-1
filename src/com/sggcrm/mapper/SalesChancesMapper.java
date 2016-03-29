package com.sggcrm.mapper;

import com.sggcrm.pojo.SalesChances;
import java.util.List;

public interface SalesChancesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SalesChances record);

    SalesChances selectByPrimaryKey(Integer id);

    List<SalesChances> selectAll();

    int updateByPrimaryKey(SalesChances record);
}