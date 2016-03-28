package com.sggcrm.mapper;

import com.sggcrm.pojo.SalesPlan;
import com.sggcrm.pojo.SalesPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesPlanMapper {
    int countByExample(SalesPlanExample example);

    int deleteByExample(SalesPlanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SalesPlan record);

    int insertSelective(SalesPlan record);

    List<SalesPlan> selectByExample(SalesPlanExample example);

    SalesPlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SalesPlan record, @Param("example") SalesPlanExample example);

    int updateByExample(@Param("record") SalesPlan record, @Param("example") SalesPlanExample example);

    int updateByPrimaryKeySelective(SalesPlan record);

    int updateByPrimaryKey(SalesPlan record);
}