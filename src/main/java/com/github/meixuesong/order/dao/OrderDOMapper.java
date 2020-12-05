package com.github.meixuesong.order.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Mapper
@Repository
public interface OrderDOMapper {
    int insert(OrderDO record);

    int insertSelective(OrderDO record);

    OrderDO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(@Param("orderDO") OrderDO record, @Param("changedFields") Set<String> changedFields);

    int updateByPrimaryKey(OrderDO record);

    int delete(OrderDO orderDO);
}
