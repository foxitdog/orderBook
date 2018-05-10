package com.blackfox.orderbook.dao;

import com.blackfox.orderbook.entity.Customer;
import com.blackfox.orderbook.entity.CustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerMapper {
    /**
     *
     * @mbggenerated 2018-03-25
     */
    int countByExample(CustomerExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int deleteByExample(CustomerExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int insert(Customer record);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int insertSelective(Customer record);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    List<Customer> selectByExample(CustomerExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    Customer selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int updateByPrimaryKeySelective(Customer record);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int updateByPrimaryKey(Customer record);
}