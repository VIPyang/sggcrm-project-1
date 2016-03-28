package com.sggcrm.mapper;

import com.sggcrm.pojo.Dicts;
import com.sggcrm.pojo.DictsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictsMapper {
    int countByExample(DictsExample example);

    int deleteByExample(DictsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dicts record);

    int insertSelective(Dicts record);

    List<Dicts> selectByExample(DictsExample example);

    Dicts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dicts record, @Param("example") DictsExample example);

    int updateByExample(@Param("record") Dicts record, @Param("example") DictsExample example);

    int updateByPrimaryKeySelective(Dicts record);

    int updateByPrimaryKey(Dicts record);
}