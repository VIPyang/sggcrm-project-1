package com.sggcrm.mapper;

import com.sggcrm.pojo.Roles;
import java.util.List;

public interface RolesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Roles record);

    Roles selectByPrimaryKey(Integer id);

    List<Roles> selectAll();

    int updateByPrimaryKey(Roles record);
}