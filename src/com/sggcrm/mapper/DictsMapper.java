package com.sggcrm.mapper;

import com.sggcrm.pojo.Dicts;
import java.util.List;

public interface DictsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dicts record);

    Dicts selectByPrimaryKey(Integer id);

    List<Dicts> selectAll();

    int updateByPrimaryKey(Dicts record);
}