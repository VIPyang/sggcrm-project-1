package com.sggcrm.mapper;

import com.sggcrm.pojo.CustomerServices;
import com.sggcrm.pojo.CustomerServicesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerServicesMapper {
    int countByExample(CustomerServicesExample example);

    int deleteByExample(CustomerServicesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomerServices record);

    int insertSelective(CustomerServices record);

    List<CustomerServices> selectByExample(CustomerServicesExample example);

    CustomerServices selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomerServices record, @Param("example") CustomerServicesExample example);

    int updateByExample(@Param("record") CustomerServices record, @Param("example") CustomerServicesExample example);

    int updateByPrimaryKeySelective(CustomerServices record);

    int updateByPrimaryKey(CustomerServices record);
}