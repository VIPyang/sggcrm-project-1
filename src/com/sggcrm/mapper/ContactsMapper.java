package com.sggcrm.mapper;

import com.sggcrm.pojo.Contacts;
import java.util.List;

public interface ContactsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Contacts record);

    Contacts selectByPrimaryKey(Integer id);

    List<Contacts> selectAll();

    int updateByPrimaryKey(Contacts record);
}