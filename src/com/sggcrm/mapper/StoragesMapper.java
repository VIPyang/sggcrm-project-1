package com.sggcrm.mapper;

import com.sggcrm.pojo.Storages;
import java.util.List;

public interface StoragesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Storages record);

    Storages selectByPrimaryKey(Integer id);

    List<Storages> selectAll();

    int updateByPrimaryKey(Storages record);
}