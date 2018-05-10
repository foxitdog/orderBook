package com.blackfox.orderbook.dao;

import com.blackfox.orderbook.entity.Product;
import com.blackfox.orderbook.entity.ProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    /**
     *
     * @mbggenerated 2018-03-25
     */
    int countByExample(ProductExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int deleteByExample(ProductExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int insert(Product record);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int insertSelective(Product record);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    List<Product> selectByExample(ProductExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    Product selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int updateByPrimaryKey(Product record);
}