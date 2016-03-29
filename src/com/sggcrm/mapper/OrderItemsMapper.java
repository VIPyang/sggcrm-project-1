package com.sggcrm.mapper;

import com.sggcrm.pojo.OrderItems;
import java.util.List;

public interface OrderItemsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderItems record);

    OrderItems selectByPrimaryKey(Integer id);

    List<OrderItems> selectAll();

    int updateByPrimaryKey(OrderItems record);
}