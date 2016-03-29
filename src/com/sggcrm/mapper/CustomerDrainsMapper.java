package com.sggcrm.mapper;

import com.sggcrm.pojo.CustomerDrains;
import java.util.List;

public interface CustomerDrainsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerDrains record);

    CustomerDrains selectByPrimaryKey(Integer id);

    List<CustomerDrains> selectAll();

    int updateByPrimaryKey(CustomerDrains record);
}