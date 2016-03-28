package com.sggcrm.mapper;

import com.sggcrm.pojo.RoleAuthority;
import com.sggcrm.pojo.RoleAuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleAuthorityMapper {
    int countByExample(RoleAuthorityExample example);

    int deleteByExample(RoleAuthorityExample example);

    int insert(RoleAuthority record);

    int insertSelective(RoleAuthority record);

    List<RoleAuthority> selectByExample(RoleAuthorityExample example);

    int updateByExampleSelective(@Param("record") RoleAuthority record, @Param("example") RoleAuthorityExample example);

    int updateByExample(@Param("record") RoleAuthority record, @Param("example") RoleAuthorityExample example);
}