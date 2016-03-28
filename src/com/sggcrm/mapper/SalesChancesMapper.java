package com.sggcrm.mapper;

import com.sggcrm.pojo.SalesChances;
import com.sggcrm.pojo.SalesChancesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesChancesMapper {
    int countByExample(SalesChancesExample example);

    int deleteByExample(SalesChancesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SalesChances record);

    int insertSelective(SalesChances record);

    List<SalesChances> selectByExample(SalesChancesExample example);

    SalesChances selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SalesChances record, @Param("example") SalesChancesExample example);

    int updateByExample(@Param("record") SalesChances record, @Param("example") SalesChancesExample example);

    int updateByPrimaryKeySelective(SalesChances record);

    int updateByPrimaryKey(SalesChances record);
}