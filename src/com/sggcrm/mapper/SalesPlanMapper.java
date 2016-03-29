package com.sggcrm.mapper;

import com.sggcrm.pojo.SalesPlan;
import java.util.List;

public interface SalesPlanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SalesPlan record);

    SalesPlan selectByPrimaryKey(Integer id);

    List<SalesPlan> selectAll();

    int updateByPrimaryKey(SalesPlan record);
}