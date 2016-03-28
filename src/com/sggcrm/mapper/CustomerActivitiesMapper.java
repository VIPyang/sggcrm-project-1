package com.sggcrm.mapper;

import com.sggcrm.pojo.CustomerActivities;
import com.sggcrm.pojo.CustomerActivitiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerActivitiesMapper {
    int countByExample(CustomerActivitiesExample example);

    int deleteByExample(CustomerActivitiesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomerActivities record);

    int insertSelective(CustomerActivities record);

    List<CustomerActivities> selectByExample(CustomerActivitiesExample example);

    CustomerActivities selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomerActivities record, @Param("example") CustomerActivitiesExample example);

    int updateByExample(@Param("record") CustomerActivities record, @Param("example") CustomerActivitiesExample example);

    int updateByPrimaryKeySelective(CustomerActivities record);

    int updateByPrimaryKey(CustomerActivities record);
}