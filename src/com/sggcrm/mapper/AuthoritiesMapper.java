package com.sggcrm.mapper;

import com.sggcrm.pojo.Authorities;
import java.util.List;

public interface AuthoritiesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Authorities record);

    Authorities selectByPrimaryKey(Integer id);

    List<Authorities> selectAll();

    int updateByPrimaryKey(Authorities record);
}