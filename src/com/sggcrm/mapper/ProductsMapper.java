package com.sggcrm.mapper;

import com.sggcrm.pojo.Products;
import java.util.List;

public interface ProductsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Products record);

    Products selectByPrimaryKey(Integer id);

    List<Products> selectAll();

    int updateByPrimaryKey(Products record);
}