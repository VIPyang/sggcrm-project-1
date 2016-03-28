package com.sggcrm.mapper;

import com.sggcrm.pojo.CustomerDrains;
import com.sggcrm.pojo.CustomerDrainsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerDrainsMapper {
    int countByExample(CustomerDrainsExample example);

    int deleteByExample(CustomerDrainsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomerDrains record);

    int insertSelective(CustomerDrains record);

    List<CustomerDrains> selectByExample(CustomerDrainsExample example);

    CustomerDrains selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomerDrains record, @Param("example") CustomerDrainsExample example);

    int updateByExample(@Param("record") CustomerDrains record, @Param("example") CustomerDrainsExample example);

    int updateByPrimaryKeySelective(CustomerDrains record);

    int updateByPrimaryKey(CustomerDrains record);
}