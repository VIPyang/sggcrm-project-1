package com.sggcrm.mapper;

import com.sggcrm.pojo.RoleAuthority;
import java.util.List;

public interface RoleAuthorityMapper {
    int insert(RoleAuthority record);

    List<RoleAuthority> selectAll();
}