package com.sggcrm.mapper;

import com.sggcrm.pojo.Storages;
import com.sggcrm.pojo.StoragesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoragesMapper {
    int countByExample(StoragesExample example);

    int deleteByExample(StoragesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Storages record);

    int insertSelective(Storages record);

    List<Storages> selectByExample(StoragesExample example);

    Storages selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Storages record, @Param("example") StoragesExample example);

    int updateByExample(@Param("record") Storages record, @Param("example") StoragesExample example);

    int updateByPrimaryKeySelective(Storages record);

    int updateByPrimaryKey(Storages record);
}