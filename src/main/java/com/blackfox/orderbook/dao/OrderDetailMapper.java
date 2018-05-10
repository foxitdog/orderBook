package com.blackfox.orderbook.dao;

import com.blackfox.orderbook.entity.OrderDetail;
import com.blackfox.orderbook.entity.OrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailMapper {
    /**
     *
     * @mbggenerated 2018-03-25
     */
    int countByExample(OrderDetailExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int deleteByExample(OrderDetailExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int insert(OrderDetail record);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int insertSelective(OrderDetail record);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    List<OrderDetail> selectByExample(OrderDetailExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    OrderDetail selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int updateByExampleSelective(@Param("record") OrderDetail record, @Param("example") OrderDetailExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int updateByExample(@Param("record") OrderDetail record, @Param("example") OrderDetailExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int updateByPrimaryKeySelective(OrderDetail record);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int updateByPrimaryKey(OrderDetail record);
}