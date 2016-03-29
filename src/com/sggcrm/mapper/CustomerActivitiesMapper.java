package com.sggcrm.mapper;

import com.sggcrm.pojo.CustomerActivities;
import java.util.List;

public interface CustomerActivitiesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerActivities record);

    CustomerActivities selectByPrimaryKey(Integer id);

    List<CustomerActivities> selectAll();

    int updateByPrimaryKey(CustomerActivities record);
}