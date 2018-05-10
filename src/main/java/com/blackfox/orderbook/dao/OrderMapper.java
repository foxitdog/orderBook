package com.blackfox.orderbook.dao;

import com.blackfox.orderbook.entity.Order;
import com.blackfox.orderbook.entity.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    /**
     *
     * @mbggenerated 2018-03-25
     */
    int countByExample(OrderExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int deleteByExample(OrderExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int insert(Order record);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int insertSelective(Order record);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    List<Order> selectByExample(OrderExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    Order selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int updateByPrimaryKey(Order record);
}