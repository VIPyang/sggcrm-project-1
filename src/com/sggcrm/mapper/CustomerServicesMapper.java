package com.sggcrm.mapper;

import com.sggcrm.pojo.CustomerServices;
import java.util.List;

public interface CustomerServicesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerServices record);

    CustomerServices selectByPrimaryKey(Integer id);

    List<CustomerServices> selectAll();

    int updateByPrimaryKey(CustomerServices record);
}